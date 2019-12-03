<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	response.setContentType("text/html;charset=utf-8");
	out.println("<h1>response内置对象</h1>");
	out.println("<hr>");
	//out.flush();//清空缓冲区，强行打印
	PrintWriter outer = response.getWriter();	//获得输出流对象，PrintWriter对象总是在内置out对象之前打印
	outer.println("大家好，我是response对象生成的输出流outer对象");
	response.sendRedirect("request1.jsp");//请求重定向
%>