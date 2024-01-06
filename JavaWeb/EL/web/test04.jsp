<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test04</title>
</head>
<body>
	${user.username} <br>
	${user["username"]} <br>
	${arr[0]} <br>
	${map["username"] }<br>
	${userArr[0].username} <br>
</body>
</html>