<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="ELDemo" uri="http://www.qfedu.com"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test11</title>
</head>
<body>
	<%--调用EL自定义函数 --%>
	${ELDemo:sayHello("xiaoqian")}
</body>
</html>