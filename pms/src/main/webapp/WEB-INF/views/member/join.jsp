<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 </title>
</head>
<body>
	<h2>회원 가입 </h2>
	<form:form method="POST" action="/pms/add/member.do" commandName="member">
	<form:hidden path="seq"/>
		<table>
			<tr>
				<td>
					<form:label path="id">id</form:label>
				</td>
				<td>
					<form:input path="id"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<form:label path="pw">패스워드</form:label>
				</td>
				<td>
					<form:input path="pw"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<form:label path="name">성함</form:label>
				</td>
				<td>
					<form:input path="name"/>
				</td>
			
			</tr>
			<tr>
				<td>
					<form:label path="age">나이</form:label>
				</td>
				<td>
					<form:input path="age"/>
				</td>
			</tr>
			
			<tr>
				<td>
					<form:label path="adress">주소</form:label>
				</td>
				<td>
					<form:input path="adress"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입">
				</td>
			</tr>
		</table>
		<a href="/member.do">취소</a>
	
	
	
	
	</form:form>
</body>
</html>