<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test05</title>
</head>
<body>
	<%pageContext.setAttribute("username", "小千");%>
	<%request.setAttribute("username", "小锋");%>
	<%session.setAttribute("username", "好程序员");%>
	<%application.setAttribute("username", "扣丁学堂");%>
	<%--EL隐含对象 --%>
	${pageScope.username} <br>
	${requestScope.username} <br>
	${sessionScope.username} <br>
	${applicationScope.username}
</body>
</html>