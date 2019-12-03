<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import= "dao.ItemsDAO,entity.Items,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
		<h1>商品详情</h1>
		<hr>
		<%
		ItemsDAO itemsDao = new ItemsDAO();
		Items item = itemsDao.getItemsById(Integer.parseInt(request.getParameter("id")));
		if(item!=null){
		%>
		<div>
		<dl>
		<dt><img src="images/<%=item.getPicture() %>"></dt>
		<dd><%=item.getName() %>></dd>
		<dd>价格:<%=item.getPrice() %>&nbsp;&nbsp;产地:<%=item.getCity() %>></dd>	
		</dl>
		</div>
		<%
			}
			%>
	<%
			String list = "";
			//从客户端获取cookies对象
			Cookie[] cookies = request.getCookies();
		//遍历这个集合
			if(cookies!= null&& cookies.length> 0){
			for(Cookie c :cookies){
				if(c.getName().equals("ListViewCookie"))
				{
					list = c.getValue();
				}
				
			}
			}
			list+=request.getParameter("id")+",";
			//如果浏览记录超过一千条，清零。
			String []arr= list.split(",");
			if(arr!=null&&arr.length>0){
				if(arr.length>=1000){
				list = "";
				
			}
			}
			//将获取的cookie对象添加到cookies数组当中
			Cookie cookie = new Cookie("ListViewCookie",list);
			response.addCookie(cookie);
			%>
			<%
			ArrayList<Items> itemslist = itemsDao.getViewList(list); 
			 if(itemslist!=null&&itemslist.size()>0 ){
				for(Items i : itemslist){
		%>
				<div>
		<dl>
		<dt>
		<a href="details1.jsp?id=<%=i.getId() %>">
		<img src="images/<%=i.getPicture() %>" width="120" height="90" border="1"></a>
		</dt>
		<dd class="dd_name"><%=i.getName() %></dd>
		<dd class="dd_city">价格:<%=i.getPrice() %>&nbsp;&nbsp;产地:<%=i.getCity() %></dt>
		</dl>
		</div>
			<%
				}
			}
			%>
</body>
</html>