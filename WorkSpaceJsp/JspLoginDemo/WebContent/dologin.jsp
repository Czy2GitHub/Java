<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
</head>
<body>

<%
  //  String username ="";
   // String  password= ""; 
    request.setCharacterEncoding("utf-8");
    //获取用户名密码
   String username =request.getParameter("username");
   String password =request.getParameter("password");
    //判断用户名密码
    if("admin".equals(username) && "admin".equals(password)){
    	request.setAttribute("loginUser",username);
    	//请求转发
    	request.getRequestDispatcher("login_success.jsp").forward(request, response);
    }
    else{
    	//请求重定向
    	response.sendRedirect("login_fail.jsp");
    }
    %>

</body>
</html>