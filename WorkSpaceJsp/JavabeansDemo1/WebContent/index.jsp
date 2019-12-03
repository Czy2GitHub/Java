
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.po.Users"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
		Users user = new Users();
		user.setUsername("admin");
		user.setPassword("admin");

%>
		<h1>使用普通方法创建JavaBean的实例</h1>
		<hr>
		用户名:<%=user.getUsername() %><br>
		密码:<%=user.getPassword() %><br>
</body>
</html>