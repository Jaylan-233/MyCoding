<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/1
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--使用include 引入test07这个页面 --%>
<%--如果是代码 -要求符合jsp规范--%>
<%--可以是文本文件--%>
<h1>使用include 引入test07.jsp界面</h1>
<br>
来自test07.jsp的东西
<br>
<%@include file="test07.jsp"%>
<%--引入文件--%>
<%--可以引入jsp页面--%>
<%--也可使用引入 文本文件 可以其中HTML会被解析--%>
<%--下面是从HelloWorld引入的东西--%>
<br>
来自HelloWorld.txt的内容
<br>
<%@include file="HelloWrold.txt"%>
</body>
</html>
