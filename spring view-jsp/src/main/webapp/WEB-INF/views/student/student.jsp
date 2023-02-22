<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록 화면 </title>
</head>
<body>
	<h2>학생 정보 등록</h2>
	<form:form method="POST" action="/tok/add/student.do" commandName="student">
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
					<form:label path="name">이름</form:label>
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
				<td colspan="2">
					<input type="submit" value="저장">
				</td>
			</tr>
		
		</table>
	</form:form>
</body>
</html>