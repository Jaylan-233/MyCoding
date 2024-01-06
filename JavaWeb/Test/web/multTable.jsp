<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>exercise</title>
<style>
    div{
    border: 1px solid black;
    display: inline-block;
    padding: 5px;
    }
</style>


<body>
<%
    int row = 0;
    int colum = 0;
    for (row = 1; row <= 9; row++) {
        for (colum = 1; colum <= row; colum++) {
            out.print("<div>" + colum + "x" + row + "=" + colum * row + "</div>");
        }
        out.print("<br>");
    }


%>
</body>
</html>