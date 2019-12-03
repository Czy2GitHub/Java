<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>我的主页</title>
</head>
<body>
	<h1>欢迎大家访问我的主页！</h1>
	<!-- 客户端可以看见的注释 -->
	<%-- 只有在代码中可以看见的注释  --%>
	<% out.println("大家好，我是电棍"); %>
	<%!
		String s = "电棍";   //声明了一个字符串变量
		int add(int x, int y){		//声明一个方法返回整形变量求和
		return x + y;
		}
	%>
	你好<%=s %><br>
	x+y=<%=add(3,5) %><br>
</body>
</html>