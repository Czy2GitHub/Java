<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息</title>
</head>
<body>
	<h1>用户信息</h1>
	<hr>
	<%
request.setCharacterEncoding("utf-8");
String username="";
String password="";
Cookie[] cookies = request.getCookies();
if(cookies!=null&&cookies.length>0){
	for(Cookie c:cookies){
		if(c.getName().equals("username")){
			//使用utf-8编码
		      username = URLDecoder.decode(c.getValue(),"utf-8");
		}
	if(c.getName().equals("password"))
	             password = URLDecoder.decode(c.getValue(),"utf-8");       
	}
}
%>

	用户名：<%=username %>
	<br>
	密码：<%=password %>
</body>
</html>