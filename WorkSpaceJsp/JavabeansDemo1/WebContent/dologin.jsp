<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>setProperty使用方法</h1>
	<jsp:useBean id="user" class="com.po.Users" scope="page" />
	<%--根据表单匹配所有属性 --%>
	<%--
	<jsp:setProperty name="user" property="*"/>
	 --%>
	 <%--跟表单无关，共同手工赋值给属性 --%>
	 <%-- 
	 <jsp:setProperty property="password" name="user"/>
	 --%>
	 <%-- 通过URL传参数给属性赋值 --%>
	 <jsp:setProperty property="username" name="user" param="mypass"/>
	 <jsp:setProperty property="password" name="user" param="mypass"/>
	<%-- 传统表达式方法获取用户名和密码 --%>
	<%-- 
	用户名:<%=user.getUsername() %>
	密码:<%=user.getPassword() %>
	 --%>
	 <%-- 使用getProperty来获取用户名和密码 --%>
	用户名:<jsp:getProperty property="username" name="user"/>
	密码: <jsp:getProperty property="password" name="user"/>
	<br>
	<br>
		<a href="textScope.jsp">测试JavaBean的四个作用域范围</a>
		<%
			request.getRequestDispatcher("textScope.jsp").forward(request,response);
		%>
</body>
</html>