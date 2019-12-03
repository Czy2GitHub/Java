<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String username="";
String password="";
Cookie[] cookies = request.getCookies();
if(cookies!=null&&cookies.length>0){
	for(Cookie c:cookies){
		if(c.getName().equals("username")){
					//UTF-8解码
		      username = URLDecoder.decode(c.getValue(),"utf-8");
		}
	if(c.getName().equals("password"))
	             password = URLDecoder.decode(c.getValue(),"utf-8");       
	}
}
%>
	<h1>用户登录</h1>
	<hr>
	<form action="dologin.jsp" name="loginForm" metod="post">
	<table>
	<tr>
	<td>用户名:</td>
	<td><input type="text" name="username" value="<%=username %>" /> </td>
	</tr>
	<tr>
	<td>密 码:</td>
	<td><input type="password" name="password" value="<%=password %>" /></td>
	</tr>
	<tr>
	<td colspan="2" ><input type="checkbox" name="isUseCookie" checked="checked">是否记住用户名和密码</input></td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" name="output" value="提交"/></td>
	</tr>
	</table>
	</form>
</body>
</html>