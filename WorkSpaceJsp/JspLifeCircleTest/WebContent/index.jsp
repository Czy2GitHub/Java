<%@ page import="java.text.*" import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Jsp的生命周期</title>
</head>
<body>
	<hr>
	<% 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	String s = sdf.format(new Date());
	%>
	今天是:<%=s %>
</body>
</html>