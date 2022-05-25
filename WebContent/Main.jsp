<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>설문조사 메인</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>음식 설문조사</h1>
<form method="post" action="<%= request.getContextPath() %>/Main_view.jsp">
<select name="code">
<option value="A">투표하러가기!!</option>
<option value="B">투표 현황 보러가기!!</option>
</select>
<input type="submit" value="이동">
</form>
</body>
</html>