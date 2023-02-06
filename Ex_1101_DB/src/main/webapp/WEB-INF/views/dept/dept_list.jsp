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
		안녕하세요
		<table border="1" align="center">
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
			</tr>
			<c:forEach var="i" items="${list}">
				<tr>
					<td>${i.deptno}</td>
					<td>${i.dname}</td>
					<td>${i.loc}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>