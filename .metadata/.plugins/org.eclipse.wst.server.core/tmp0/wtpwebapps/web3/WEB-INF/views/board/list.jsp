<%@page import="java.util.List"%>
<%@page import="model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list page</h1>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자번호</td>
		</tr>
		<%
			List<Board> boardList = (List<Board>) request.getAttribute("boardList");
			for (Board board : boardList) {
		%>
		<tr>
			<td><%=board.getId()%></td>
			<td><%=board.getTitle()%></td>
			<td><%=board.getUserId()%></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>