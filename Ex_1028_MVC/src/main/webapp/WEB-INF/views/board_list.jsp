<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<p>게시판 목록 입니다.</p>
		<hr>
		<ul>
			<c:forEach var="fruit" items="${list}">
				<li>${fruit}</li>
			</c:forEach>
		</ul>
	
	</body>
</html>