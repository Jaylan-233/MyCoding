<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test01</title>
</head>
<body>
<%--传统的写法 没有使用EL表达式--%>
<%--写在<%= %>JSP脚本里面--%>
<%--通通过request对象 调用其getAttribute方法 获取名为username的值--%>
	用户名: <%=request.getAttribute("username") %><br>

	密    码：<%=request.getAttribute("password") %><br>
</body>
</html>