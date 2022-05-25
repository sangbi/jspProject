<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String code = request.getParameter("code");
    String viewPageURI = null;
    
    if(code.equals("A")){
    	viewPageURI = "/viewModule/Food.jsp";
    }
    else if(code.equals("B")){
    	viewPageURI = "/viewModule/End.jsp";
    }
    %>
    <jsp:forward page="<%= viewPageURI %>"/>
