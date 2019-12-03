<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录成功</title>
</head>
<body>
<%
	String loginUser1 = request.getParameter("username").toString();

%>
	欢迎<%=loginUser1 %>,登录成功！
</body>
</html>