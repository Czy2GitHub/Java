<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>param</title>
</head>
<body>
		<h1>param</h1>
		<jsp:forward page="user.jsp">
		<%-- 添加新的信息--%>
		<jsp:param value="admin@123.net" name="email"/>
		<%--  修改已有信息 --%>
		<jsp:param value="88888888" name="password"/>
		</jsp:forward>
</body>
</html>