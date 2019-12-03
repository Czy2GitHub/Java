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
	String username = "";
	String password = "";
	if(pageContext.getAttribute("user")!=null){
		username = ((Users)pageContext.getAttribute("user")).getUsername();
		password = ((Users)pageContext.getAttribute("user")).getPassword();
		
	}
%>
	<h1>Javabean四个作用域范围</h1>
	<jsp:useBean id="user" class="com.po.Users" scope="page"/>
	<%-- 
	用户名:<jsp:getProperty property="username" name="user"/>
	密码:<jsp:getProperty property="password" name="user"/>
	--%>
	<hr>
	<%--使用内置对象获取用户名和密码 --%>
	用户名:<%=username %>
	密码:<%=password %>
</body>
</html>