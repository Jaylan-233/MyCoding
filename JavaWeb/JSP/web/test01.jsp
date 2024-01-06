
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>test01</title>
</head>
<body>
<%--JSP 中的表达式标签 --%>
<%= Math.PI  %>
<br>
<%="HELLO 我是JSP标签中表达式标签显示的"%>
<br>
<%= "表达式代码不仅可以写 表达式 还能显示一些字符串等内容"%>
<br>
<%= "1+1="+1+1+"这里因为使用了连字符+号 所以会被转换成字符串"  %>
<%-- 这里的1+1会被当场字符串进行处理？--%>
<%--不用+号呢？--%>
<br>
<%= "1+1="+1+1%>
<%--这里的字符串也要用+号进行拼接--%>
<%--运算表达式和字符串使用+进行拼接后 运算表达式会变成字符串而不做运算--%>
<%--里面写的内容会转换成字符串所以会 出现拼接的操作--%>

</body>
</html>