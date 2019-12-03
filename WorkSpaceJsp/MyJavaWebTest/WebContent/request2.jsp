<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>request</title>
</head>
<body>
	<h1>request内置对象</h1>
	<%
	request.setCharacterEncoding("utf-8");//解决中文乱码
	request.setAttribute("password","123456");
	%>
	用户名：<%=request.getParameter("username") %>
	爱好：<%
		if(request.getParameterValues("favorite")!=null){
		String[] favarites = request.getParameterValues("favorite");
		for(int i = 0;i <favarites.length;i++){
			out.println(favarites[i]+"&nbsp;&nbsp;");
		}
		}
		%>
		密码<%=request.getAttribute("password") %><br>
		请求体的MIME类型<%=request.getContentType() %><br>
		协议类型及版本号<%=request.getProtocol()%><br>
		服务器主机名<%=request.getServerName() %> <br>
		服务端端口号<%=request.getServerPort() %><br>
		请求文件的长度<%=request.getContentLength() %><br>
		请求客户端的IP地址<%=request.getRemoteAddr() %> <br>
		请求的真实路径<%=request.getRealPath("request1.jsp") %><br>
		请求的上下文路径<%=request.getContextPath() %>
	
</body>
</html>