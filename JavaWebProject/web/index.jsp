<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/10/16
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <div align="center">
    <h2>欢迎登录</h2>
    <form name="login"  action="userLogin" target="_blank">
      用户名:<input type="text" name="username" placeholder="请输入用户名">
      密 码:<input type="password" name="password" placeholder="请输入密码">
    <button type="submit">登录</button>
    </form>
    <button onclick="window.location.href='html/UserRegister.html'" type="button">注册</button>
  </div>
  </body>
</html>
