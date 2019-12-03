<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Include</title>
</head>
<body>
	<h1>forward动作</h1>
	<hr>
	<jsp:forward page="user.jsp"/>
	<!-- 等价于
	request.getRequestDispatcher("user.jsp").forward(request,response);
	 -->
</body>
</html>