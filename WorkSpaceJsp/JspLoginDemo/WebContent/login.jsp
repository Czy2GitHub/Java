<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>
		<h1 >登录界面</h1>
	<form action="dologin.jsp" method="post">
	<table>
	<tr>
	<td>用户名</td>
	<td><input type="text" name="username" value=""/></td>
	</tr>
	<tr>
	<td>密码</td>
	<td><input type="password" name="password" value=""/></td>
	</tr>
	<tr>
	<td coslpan=2><input type="submit" value="提交"/></td>
	</tr>
	</table>
	</form>
</body>
</html>