<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Project.*" %>
    <% request.setCharacterEncoding("UTF-8");%>
	<%@ page import="Project.FoodVo" %>
	<%@ page import="Project.FoodDao" %>
	
	<% String food = request.getParameter("food"); %>
	<% String etc = request.getParameter("etc"); %>
	<% FoodVo fv = new FoodVo(food); %>
	<% FoodDao fdao = new FoodDao(); %>
	
	<%if (etc != null) { %>
		<% if (etc.equals(etc)) {%>
		<% fdao.testInsert(fv); %>
		<%}%>
	<%} %>

	<% fdao.testUpdate(fv); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.println("완료"); %>
<a href="../Main.jsp">메인으로 이동</a><br>
		
</body>
</html>