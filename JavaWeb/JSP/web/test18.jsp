<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/6
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test18</title>
</head>
<body>
<%
    pageContext.setAttribute("author", "千锋教育");
    pageContext.setAttribute("name","Zhang san");
    out.println();
    Object author = pageContext.getAttribute("author");
    out.print(author);
%>
</body>
</html>
