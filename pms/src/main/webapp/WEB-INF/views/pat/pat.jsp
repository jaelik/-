<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펫 상세 정보 화면  </title>
</head>
<body>
	<h2>펫 정보 등록 </h2>
	<form:form method="post" action="/pms/add/pat.do" commandName="pat">
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
					<form:label path="patname">펫이름</form:label>
				</td>
				<td>
					<form:input path="patname"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="patage">펫나이</form:label>
				</td>
				<td>
					<form:input path="patage"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="patsex">펫성별</form:label>
				</td>
				<td>
					<form:input path="patsex"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="patbirth">펫생일</form:label>
				</td>
				<td>
					<form:input path="patbirth"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록">
				</td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>