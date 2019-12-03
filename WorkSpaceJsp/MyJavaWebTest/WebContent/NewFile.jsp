<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>表单提交方式</title>
</head>
<body>
	<h1>用户登陆</h1>
	<hr>
	<form action="dologin.jsp" name="loginForm" method="get">
	
	<%--action是指让目标页面响应发出的请求，name是表单名字，method是表单的提交方式 --%>
	<table>
	<tr>
	<td>用户名</td>
	<%--input指的是单行文本框 type定义单行输入字段,name是名字 --%>
	<td> <input type="text" name="username"/></td>
	</tr>
	<tr>
	<td>密码：</td>
	<td><input type="password" name="password"/></td>
	</tr>
	<tr>
	<%-- colspan指单元格可以跨越的行数，submit指提交按钮 value指按钮中的文本 --%>
	<td colspan="2"><input type="submit" value="登录"/></td>
	</tr>
	</table>
	
	
	
	</form>
</body>
</html>