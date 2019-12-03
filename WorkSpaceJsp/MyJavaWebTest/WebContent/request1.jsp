<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册</title>
</head>
<body>	
	
	<form name="regForm" action="request2.jsp" method="post">
	<table >
	<tr>
	<td>用户名：</td>
	<td><input type="text" name="username"/></td>
	</tr>
	<tr>
	<td>爱好：</td>
	<td>
	<%--checkbox复选框按钮 --%>
	<input name="favorite" type="checkbox" value="read"/>读书
	<input name="favorite" type="checkbox" value="music"/>音乐
	<input name="favorite" type="checkbox" value="movie"/>电影
	<input name="favorite" type="checkbox" value="Internet"/>上网
	</td>
	
	</tr>
	<tr>
	<td colspan=2><input type="submit" value="提交"/></td>
	</tr>
	
	</table>
	</form>
	<%--超链接 --%>
	<a href="request2.jsp?username=李四">测试URL传参数</a>
</body>
</html>