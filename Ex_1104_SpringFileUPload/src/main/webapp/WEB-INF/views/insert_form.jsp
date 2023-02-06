<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send(f){
				var title = f.title.value;
				var photo = f.photo.value;
				
				if(title == ''){
					alert('제목을 입력해주세요');
					return;
				}
				if(photo == ''){
					alert('파일을 첨부해 주세요');
					return
				}
				
				f.action = "upload.do";
				f.submit();
			}
		</script>
	</head>
	<body>
		<form method="post" enctype="mutipart/form-data">
			제목 : <input name ="title" ><br>
			사진 : <input type="file" name="photo"><br>
			<input type="button" value="전송" onclick="send(this.form)">
		</form>
	</body>
</html>