<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>application内置对象</h1>
	<% application.setAttribute("city",	"北京");
	   application.setAttribute("postcode", "10000");
	   application.setAttribute("email", "lisi@126.com");
	%>
	所在城市是:<%=application.getAttribute("city") %><br>
	application中属性有:<%
		Enumeration attributes = application.getAttributeNames();
		while(attributes.hasMoreElements()){
			out.println(attributes.nextElement());
		}
		%>
		<br>
		JSP(SERTVLET)引擎及版本号：<%=application.getServerInfo() %>
</body>
</html>