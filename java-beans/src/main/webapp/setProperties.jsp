<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="org.learn.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="firstName" name="user" value="Prince" />
	<jsp:setProperty property="lastName" name="user" value="Kumar" />
	
	<p>properties changed.</p>
</body>
</html>