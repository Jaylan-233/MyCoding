<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test02</title>
</head>
<body>
<%--使用EL表达式--%>
使用了EL表达式
	用户名: ${username}<br>
<%--相当于<%=request.getAttribute("username") %>--%>
<%--一长串 变成一小段 --%>
	密    码：${password}<br>
</body>
</html>