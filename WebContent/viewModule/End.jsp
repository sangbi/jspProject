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
<title>투표 현황 페이지</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>투표결과!</h1>
<style>
  table, th, td {
    border: 1px solid #bcbcbc;
  }
  table {
    width: 600px;
    height: 100px;
  }
</style>
<table border="3">
<tr>
<td><strong> 번호 </strong></td>
<td><strong> 음식 </strong></td>
<td><strong> 총 투표수 </strong></td>
</tr>
<%
List<FoodVo> list = new ArrayList<>();
list = dao.testSelect();
%>
<% for(FoodVo tmp : list){ %>
<tr>
<td><%= tmp.getNum()%></td>
<td><%= tmp.getName()%></td>
<td><% out.print(tmp.getVote());%></td>
<%
}
%>
</tr>
</table>

<br><br>
<input type="button" value="메인으로" onClick="location.href='Main.jsp'"/>
</body>
</html>