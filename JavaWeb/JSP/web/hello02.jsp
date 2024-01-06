<%--JSP 页面的基本结构--%>


<%--JSP的指令元素 说明这个界面用的是 什么编码方式 能用什么语言--%>
<%--language="java"  好能不能改成别的? --%>
<%--会自动生成--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--HTML 的代码--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
</head>
<body>
<!-- HTML注释信息  能在页面中显示的注释 -->
<%-- 不会被编译的注释 生成的页面中看不到--%>
<h2>Hello,<%=request.getParameter("username") %></h2>
<%--JSP中的--%>
</body>
</html>