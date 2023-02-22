<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보 화면</title>
</head>
<body>
	<h2>학생 상세 정보 </h2>
	<table>
		<tr>
			<td>ID:</td>
			<td>${student.id}</td>
		</tr>
		<tr>
			<td>이름:</td>
			<td>${student.name}</td>
		</tr>
	
		<tr>
			<td>나이:</td>
			<td>${student.age}</td>
		</tr>
	
	
	</table>
</body>
</html>