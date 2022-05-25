<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*,Project.*" %>
    <%@ page import="Project.FoodDao" %>
    <jsp:useBean id="vo" class="Project.FoodVo" scope="page"/>
    <jsp:setProperty name="vo" property="*"/>
    <%@page import="java.util.List" %>
    <% FoodDao dao = new FoodDao(); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표페이지</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<form method="post" action="viewModule/Food_Proc.jsp">
<%
List<FoodVo> list;
list = dao.testSelect();
%>
<% int i = 0;
for(FoodVo tmp : list){ %>
<input type="radio" name="food" value="<%= tmp.getName() %>"><%= tmp.getName() %>
<br>
<% i++;
if(list.size() == i)%>
<%} %>
<input type="radio" name="etc"><label>기타</label>
<input type="text" name="food"><br>
<input type="submit" value="전송">
<br><br>
<input type="button" value="메인으로" onClick="location.href='Main.jsp'"/>
</form>
</body>
</html>