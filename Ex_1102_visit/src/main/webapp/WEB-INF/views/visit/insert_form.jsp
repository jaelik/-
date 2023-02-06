<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send(f){
				//유효성 체크 
				var name = f.name.value;
				var content = f.content.value;
				var pwd = f.pwd.value;
				
				if(name==''){
					alert("이름을 입력해주세요")
					return;
				}
				if(content==''){
					alert("내용을 입력해주세요")
					return;
				}
				if(pwd==''){
					alert("비밀번호을 입력해주세요")
					return;
				}
				
				//사진에 대한 유효성 체크를 해버리면 파일을 업로드 하지 않으면 통과할 수 없게 되기 떄문에 
				//파일에 대한 유효성 체크는 당장은 하지 않는게 좋다 .
				
				f.method="post"
				f.action="insert.do";
				f.submit();
				
			}
		</script>
	</head>
	<body>
		<form enctype="multipart/form-data">
			<table border="1" align="center">
				<caption>:::새글 작성하기:::</caption>
				<tr>
					<th>작성자</th>
					<td><input name="name"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea row="5" cols="50" name="content" style="resize:none;" wrap="on"></textarea></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input name="pwd" type="password"></td>
				</tr>
				<tr>
					<th>이미지 첨부</th>
					<td><input type="file" name="photo"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="등록하기" onclick="send(this.form)">
						<input type="button" value="목록으로" onclick="location.href='list.do'">
					</td>
				</tr>
			</table>
		
		
		</form>
	</body>
</html>