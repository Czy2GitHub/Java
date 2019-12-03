<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>我的主页</title>
</head>
<body>
	<h1>out内置对象</h1>
<% out.println("<h2>静夜思</h2>"); 
	out.println("床前明月管<br>");
	out.println("疑是地上霜<br>");
	out.flush();
//	out.clear();	//清除缓冲区，在flush后使用会抛出异常
	out.clearBuffer();//清除缓冲区，不会抛出异常
	out.println("举头望明月<br>");
	out.println("低头思故乡");


%>
	缓冲区大小：<%=out.getBufferSize() %>byte<br>
	缓冲区剩余大小<%=out.getRemaining() %><br>
	是否自动清空缓冲区:<%=out.isAutoFlush() %><br>
</body>
</html>