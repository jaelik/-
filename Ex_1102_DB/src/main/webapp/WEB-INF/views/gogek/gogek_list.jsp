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
		<table border="1" align="center">
			<tr>
				<th>고객번호</th>
				<th>고객이름</th>
				<th>고객주소</th>
				<th>주민번호</th>
				<th>담당자</th>
			</tr>
			<c:forEach var ="i" items="${list2}">
				<tr>
					<td>${i.gobun}</td>
					<td>${i.goname}</td>
					<td>${i.goaddr}</td>
					<td>${i.gojumin}</td>
					<td>${i.godam}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="4" align="center">
					<input type="button" value="prev" onclick="location.href='prev.do'">
				</td>
			</tr>
		</table>
	</body>
</html>