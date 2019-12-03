<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>乘法表</title>
</head>
<body>
	<h1>九九乘法表</h1>
	<hr>
	<%
	//返回九九乘法表对应的Java代码
	for(int i = 1 ;i <= 9;i++){
		for(int j =1;j <= i ;j++){
			out.print(i+"*"+j+"="+i*j+" ");
			if(j == i){
			}
		}
			out.print("<br>");
	}
	%>
	<%!
			//脚本方式打印九九乘法表	要使用jsp中的参数 JspWriter out进行输出打印
		void printMulitable1(JspWriter out) throws Exception			
	{
		for(int i = 1 ;i <= 9;i++){
			for(int j =1;j <= i ;j++){
				out.print(i+"*"+j+"="+i*j+" ");
				if(j == i){
				}
			}
				out.print("<br>");
		}
	}
		%>
</body>
</html>