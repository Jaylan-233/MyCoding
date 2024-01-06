<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/1
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="error.jsp"%>

<%--errorPage="error.jsp" 如果出现错误就跳转到error.jsp这个页面--%>
<%--但是路径不会改变--%>
<%--这里跳转使用的是转发  URL不会变--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>test06</title>
</head>
<body>
<%--这里会出现错误 枫木不能为0--%>
<% int a=1/0; %>
</body>
</html>
