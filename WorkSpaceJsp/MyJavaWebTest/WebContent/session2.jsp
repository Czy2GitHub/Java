<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	// sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	//Date d =new Date(session.getCreationTime());
	//session.setAttribute("username", "admin");
	%>
	<h1>session内置对象</h1>
	Session的ID编号：<%=session.getId() %><br>
	从Session中获取用户名：<%=session.getAttribute("username") %><br>
	用户已保存的属性：<%
					//获取用户储存的属性信息的数组
					String[] names = session.getValueNames();
					for(String i : names){
						out.println(i+"&nbsp;&nbsp");
					}
		%>
</body>
</html>