<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%request.getContextPath();%>/session-jsp/Login" method="post">
		username : <input type="text" name="username" placeholder="Enter name">
		<br>
		<br>
		password : <input type="password" name="password" placeholder="Enter password">
		</select> <br> <br> <input type="submit" value="submit">
	</form>
</body>
</html>