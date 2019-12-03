<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.net.*"%>
<html>
<head>
<title>登录成功</title>

</head>
<body>
	<a href="user.jsp" target="_blank">查看用户信息</a>
	<br>
	<br>
	<br>
	<br>
	<%
	request.setCharacterEncoding("utf-8");
	//首先判断用户是否选择了记住登陆状态
	String [] isUseCookies = request.getParameterValues("isUseCookie");
	if(isUseCookies!=null&&isUseCookies.length>0){
		//把用户名和密码保存在Cookie对象里面
		//使用URLEncoder解决中文无法解决问题
		String username = URLEncoder.encode(request.getParameter("username"),"utf-8");
		String password = URLEncoder.encode(request.getParameter("password"),"utf-8");
		Cookie usernameCookie = new Cookie("username",username);		//保存username
		Cookie passwordCookie = new Cookie("password",password);		//保存password
		usernameCookie.setMaxAge(864000);									//设置失效时间
		passwordCookie.setMaxAge(864000);
		response.addCookie(usernameCookie);								//添加cookie
		response.addCookie(passwordCookie);
	}else{
		//用户没有选择保存密码，清空cookie保存的信息并重新设置为空
		Cookie[] cookies = request.getCookies();								
		if(cookies!=null&&cookies.length>0){
			for(Cookie c:cookies){
				if(c.getName().equals("username")||c.getName().equals("password")){
					c.setMaxAge(0);			//设置失效
					response.addCookie(c);		//重新保存
					
				}
			}
		}
	}
	%>
</body>


</html>