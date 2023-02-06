<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send1(f){
				var name = f.name.value;
				
				f.action = "insert1.do";
				f.method = "post"; //파라미터에 값이 나오는것 개인정보 보호를 위해 좋다  대신 한글이 꺠지는경우가 발생 
				f.submit();
			}
			function send2(f){
				var name = f.name.value;
				var tel = f.tel.value;
				var age = f.age.value;
				
				f.action = "insert2.do";
				f.method = "post"; //파라미터에 값이 나오는것 개인정보 보호를 위해 좋다  대신 한글이 꺠지는경우가 발생 
				f.submit();
			}
		</script>
	</head>
	<body>
		<form>
			<table border="1" align="center">
				<caption>:::개인정보 입력:::</caption>
				<tr>
					<th>이름</th>
					<td><input name="name"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input name="age"></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input name="tel"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="낱개로받기" onclick="send1(this.form);">
						<input type="button" value="객체로받기" onclick="send2(this.form);">
					</td>
				</tr>
			
			</table>
		</form>
	</body>
</html>