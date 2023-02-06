<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		이름 : ${vo.name }<br>
		나이 : ${vo.age }<br>
		전화 : ${vo.tel }<br>
		<!-- 스프링에서는 jsp 에서 jsp로 바로 화면전환이 불가능하다.
			반드시  컨트롤러를 거쳐서 jsp로 전환을 해줘야합니다. -->
		<input type="button" value="돌아가기" onclick="location.href='insert_form.do'">
	</body>
</html>