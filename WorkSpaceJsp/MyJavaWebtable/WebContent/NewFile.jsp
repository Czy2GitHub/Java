<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>乘法表2</title>
</head>
<body>
	<h1>九九乘法表</h1>
	<%! 
	//返回九九乘法表的HTML文件
		String printMulitable(){
		String s ="";
		for(int i = 1 ; i <=9;i++){
			for(int j = 1 ;j <=i;j++){
				s+=i+"*"+j+"="+(i*j)+"&nbsp";		//”&nbsp“为空格的含义
			}
			s+="<br>";			//"<br>"表示换行
		}
		return s;
	}
		%>
	<%=printMulitable() %>
</body>
</html>