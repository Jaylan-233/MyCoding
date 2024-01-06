<%--
  Created by IntelliJ IDEA.
  User: Jaylan
  Date: 2023/10/30
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>

<%--99乘法表--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>99乘法表案例</title>
</head>
<%--能写css--%>
<%--能写Java 后端内容--%>
<%--能写HTML 前端内容--%>
<%--放之前来开是非常先进 现在来看是比较繁琐  冗余度很高--%>
<body>
<%--给乘法表加上边框 用CSS修饰 style --%>
<%--// 拼接代码？？ 因为<%%>中能写代码但不能进行输出操作--%>
<%
    for (int i = 1; i < 10; i++) {
%>
<%
        for (int j = 1; j <= i; j++) {
%>

<%i+"*"+j=i*j;%>


<%--会报错 如何处理？--%>
<%--<%j + "*" + i + "=" + i * j%>--%>
<% }
}
%>

</body>
</html>
