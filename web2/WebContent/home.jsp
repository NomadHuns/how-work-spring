<%@page import="web2.config.MyProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String) request.getAttribute("name");
%>
<h1>나의 이름은 : <%=name%></h1>
</body>
</html>