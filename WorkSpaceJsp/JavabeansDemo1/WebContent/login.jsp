<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>系统登录</h1>
	<form name="loginForm" action="dologin.jsp?mypass=99999999" method="post">
	<table>
	<tr>
	<td>用户名:</td>
	<td><input type="text" name="username" /></td>
	</tr>
	<tr>
	<td>密码:</td>
	<td><input type="password" name="password"/></td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" value="提交" /></td>
	</tr>
	</table>
	</form>
</body>
</html>