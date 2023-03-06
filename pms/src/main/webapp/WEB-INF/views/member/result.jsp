<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 추가 정보 화면 </title>
</head>
<body>
	<h2>가입 정보 확인 </h2>
	<table>
		<tr>
			<td>ID:</td>
			<td>${memberVO.id}</td>
		</tr>
		<tr>
			<td>비밀번호:</td>
			<td>${memberVO.pw}</td>
		</tr>
		<tr>
			<td>이름:</td>
			<td>${memberVO.name}</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${memberVO.age}</td>
		</tr>
		<tr>
			<td>주소:</td>
			<td>${memberVO.adress}</td>
		</tr>
	</table>
	
</body>
</html>