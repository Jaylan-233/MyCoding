<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/6
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page isErrorPage="true" %> <%--说明这是用来处理错误的页面 不说明 跳转不过来 会显示未找到--%>
<%--isErrorPage="true" 才会创建exception对象 --%>
<%--这里出现错误是跳转而还是执行这里的方法--%>
<%--isErrorPage="true 说明这个页面是处理异常用的--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test20</title>
</head>
<body>
<%
    //    将异常装成字符串并进行输出
    out.print(exception.toString());
    <br>
//    获取错误信息
    out.println(exception.getMessage());
    <br>
//    还能获取起因
    out.println(exception.getCause());
    <br>
//    同属输出错误的出错堆栈
//    out.println(exception.printStackTrace());
%>
</body>
</html>