<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/11/9
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面2</title>
</head>
<body>

<%
    //    获取username和password的值
    String username = request.getParameter("username");
    String password = request.getParameter("password");
//    判断username和password是否符合要求
//    判断是否为空
    if (username.isEmpty() || password.isEmpty())
        out.print("登录失败");
    else if (username.equals("xiaoqian") && password.equals("12345"))
        out.println("登录成功");
    else
        out.print("登录失败");
%>
</body>
</html>
