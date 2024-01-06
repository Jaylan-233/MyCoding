<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test02</title>
</head>
<body>
<%--Java代码要用<%%>括起来--%>
<%--使用<%Java代码%>--%>
<%
    // 这里是一些Java代码
//    Java中能写什么这里就能写什么
//    但是，请不要在这里写代码！ 耦合性太高了
    String str="Hello JSP";
    out.println(str);
%>
<%--当要使用复杂的操作时候就可以使用--%>
<%--可以使是行的--%>
</body>
</html>