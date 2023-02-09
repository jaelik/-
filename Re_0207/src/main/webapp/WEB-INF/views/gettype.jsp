<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET 방식 </title>
</head>
<body>
	<!-- form을 이용하여 요청만 넘기는 페이지를 만들어보자   -->
	<!-- GET 방식은 URL뒤에 쿼리스트링을 이용하여 데이터를 첨가하여 넘길수있다  -->
	<!-- POST 방식은 위처럼 URL로 넘길수 없다 . -->
	<!-- 스트링에서는 요청값을 넘길때 .do 많이 사용한다. -->
	<form method="get" action="/re/getKnV.do">
		<input type="text" name="id"/>
		<input type="submit" value="제출">
	</form>

</body>
</html>