<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import= "dao.ItemsDAO,entity.Items,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>商品展示</title>
</head>
<body>
		<h1>商品展示</h1>
		<hr>
		<% 
		ItemsDAO itemsDAO = new ItemsDAO();
		ArrayList<Items> list =itemsDAO.getAllItems();
		if(list!=null&&list.size()>0){
		for(int i = 0 ; i< list.size();i++){
			Items item =  list.get(i);
		%>
		 
		<div>
		<dl>
		<dt>
		<a href="details1.jsp?id=<%=item.getId() %>">
		<img src="images/<%=item.getPicture() %>" width="120" height="90" border="1"></a>
		</dt>
		<dd class="dd_name"><%=item.getName() %></dd>
		<dd class="dd_city">价格:<%=item.getPrice() %>&nbsp;&nbsp;产地:<%=item.getCity() %></dt>
		</dl>
		</div>
		<%
		
			}
		}   
		%>
		
</body>
</html>