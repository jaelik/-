<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send(f){//우리가 넘길 파라미터  idx,content,pwd
				
				//유효성 검사 
				
				f.method = "post";
				f.action ="modify.do"
				f.submit();
			}
		</script>
	</head>
	<body>
		<form>
			<input type="hidden" name="idx" value="${vo.idx}">
			
			<table border="1">
				<caption>:::방명록 수정 :::</caption>
				<tr>
					<th>작성자</th>
					<td>${vo.name}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea row="5" cols="50" name="content" style="resize:none;" wrap="on">${vo.content}</textarea></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input name="pwd" type="password" value="${vo.pwd}"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="button" value="수정" onclick="send(this.form)">
					<input type="button" value="돌아가기" onclick="location.href='list.do'">
				</tr>
			</table>
		</form>
	</body>
</html>