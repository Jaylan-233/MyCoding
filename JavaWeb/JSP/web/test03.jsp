<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>test03</title>
</head>
<body>

<%--二者区别是什么--%>
<%--定义变量的区别 --%>
<%--<%1 %>中
该里的代码只会执行一次 在JSP页面进行加载一次
定义的变量相当于全局变量
因为只会在加载该页面的时候执行 所以能用来定义方法和方法


--%>
<%--<% %>中
这里的代码每访问一次 就会执行一次
定义的变量相当于局部变量 类似(函数中)
不能用来定义方法 成员变量 因为其每访问一次都会进行执行

--%>

<%--加载时间--在JSP页面初始化时 --%>
<%--将下列成员方法进行--%>
<%!
  public int a;
  public String getString(){
    return "Hello JSP";
  }
  int num=1; //整个页面共享   全部
//  服务器重启之后会怎么样?
//  会被重置 因为该类重新编译了
%>
<h1><%=num%></h1>
<%--上能顶一顶 不能在下面定义 --%>
<%--这里的执行主体 应该是--%>
<%--这里的是每次访问都会执行的--%>
<%--这里的代码是在网页源码中是看不到的--%>
<%
  out.println("a="+a);
  out.println("<br>");
  a++;
  out.println(getString());
  num++;
  num+=10;
%>
</body>
</html>