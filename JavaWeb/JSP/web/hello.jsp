
<%--对JSP属性进行设置  设置 JSP也没的编码方式--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--    这句代码的作用？ 用来对HTML页面进行设置--%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
</head>
<body>
<%--获取 username的值并显示--%>
<%--这里直接可以和网页进行交互--%>
<h2>Hello,<%=request.getParameter("username") %></h2>
<%--如何知道调用的是哪个Servlet--%>
<%--交给他自己处理  本质就是一个Servlet --%>
</body>
</html>