<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	//控制日期格式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//获取session时间
	Date d =new Date(session.getCreationTime());
	//为session设置属性
	session.setAttribute("username", "admin");
	session.setAttribute("password", "123456");
	session.setAttribute("age","18");
	
	//设置当前session最大生成期限
	//session.setMaxInactiveInterval(10);
	
	%>
	<h1>session内置对象</h1>
	<%--获取时间 --%>
	Session创建时间：<%=sdf.format(d) %><br>
	<%-- 获取编号 --%>
	Session的ID编号：<%=session.getId() %><br>
	<%-- 获取绑定的用户名 --%>
	从Session中获取用户名：<%=session.getAttribute("username") %><br>
	<%--跳转到第二个页面 --%>
	<a href="session2.jsp" target="_blank">跳转到session2</a>
</body>
</html>