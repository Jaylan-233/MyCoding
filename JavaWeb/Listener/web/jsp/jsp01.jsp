<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp01</title>
</head>
<body>
	<c:choose>
		<c:when test="${null==sessionScope.bean }">
		<a href="${pageContext.request.contextPath}/login.html">登录</a><br><br>
		</c:when>
		<c:otherwise>
		你好，${sessionScope.bean.username}
		<a href="${pageContext.request.contextPath}/Servlet08">退出</a><br><br>
		</c:otherwise>
	</c:choose>
	在线用户列表: <br>
	<c:forEach var="map" items="${requestScope.beanMap}">
		${map.value}<br>
	</c:forEach>
</body>
</html>