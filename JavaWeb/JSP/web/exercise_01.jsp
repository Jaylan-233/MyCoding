<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/9
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%--直接将表单中的信息交给jsp页面(本质是Servlet)--%>
<form action="exercise_02.jsp">
    <label>
        用户名:<input type="text" name="username">
    </label>
    <br>
    <label>
        密码: <input type="password" name="password">
    </label>
    <br>
    <button type="submit">登录</button>
</form>
</body>
</html>
