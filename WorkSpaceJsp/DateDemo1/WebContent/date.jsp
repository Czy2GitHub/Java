<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,java.text.*"%>
   <%
   Date d = new Date();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
   String s = sdf.format(d);
  %>
  <%=s%>