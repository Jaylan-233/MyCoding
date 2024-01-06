<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/2
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test17</title>
</head>
<body>
<h1>out对象使用</h1>
<br>
<%
// out对象有缓冲区  当缓冲区满了才进行输出
    int size=out.getBufferSize();
//    out.getBufferSize---获取缓冲区大小
//    直接调用使用out对象
    out.println("获取缓冲区大小："+size);

//    关闭书输出
    out.close();
%>
</body>
</html>
