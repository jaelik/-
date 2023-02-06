<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1" align="center">
				<tr>
					<th>사원번호</th>
					<th>사원이름</th>
					<th>부서번호</th>
					<th>연봉</th>
				</tr>
			<c:forEach var="i" items="${list}">
				<tr>
					<td>${i.sabun }</td>
					<td>${i.saname }</td>
					<td>${i.deptno }</td>
					<td>${i.sapay }</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="center">
					<input type="button" value="next" onclick="location.href='insert.do'">
				</td>
			</tr>
		</table>
		
	</body>
</html>