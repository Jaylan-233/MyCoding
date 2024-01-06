<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/6
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="test20_expection.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test19</title>
</head>
<body>
<%
    int[] arr= new int[1];
//   这里会因为数组出现异常
    arr[2]=2;
//    错误信息会发交给exception对象
%>
</body>
</html>

