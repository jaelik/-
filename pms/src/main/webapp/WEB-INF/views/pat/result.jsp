<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펫 상세 정보</title>
</head>
<body>
	<h2>펫 상세 정보</h2>
	<table>
		<tr>
			<td>ID :</td>
			<td>${pat.id}</td>
		</tr>
		
		<tr>
			<td>펫 이름 :</td>
			<td>${pat.patname}</td>
		</tr>
		<tr>
			<td>펫 나이 :</td>
			<td>${pat.patage}</td>
		</tr>
		<tr>
			<td>펫 성별 :</td>
			<td>${pat.patsex}</td>
		</tr>
		<tr>
			<td>펫 생일 :</td>
			<td>${pat.patbirth}</td>
		</tr>
		
	
	
	</table>
</body>
</html>