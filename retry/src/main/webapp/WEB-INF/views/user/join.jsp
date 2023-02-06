<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			<style type="text/css">
		#id_ok{
				color: #008000;
				display: none;
				}
		#id_already{
					color: #F55939;
					display: none;	
					}
			</style>
		<script src="${pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
		<!-- 외부 스크립트 파일을 연결하는 코드   (다음  도로명 검색 api를 쓰기위한 부분)-->
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<!-- jquery문 사용을 위한 -->
		﻿<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
		
		<script vv>
		 function join(f){
			var id = f.id.value;
			var pwd = f.pwd.value;
			var pwdChk = f.pwdChk.value;
			var name = f.name.value;
			var birth = f.birth.value;
			var email = f. email.value;
			var tel = f.tel.value;
			//주소로 받는 값들을  1,2,3 을 받는다.
			var memberAddr1 = f.memberAddr1.value;
			var memberAddr2 = f.memberAddr2.value;
			var memberAddr3 = f.memberAddr3.value;
			var warnMsg = $(".mail_input_box_warn");    // 이메일 입력 경고글
			var email_check = false; //이메일 유효성 검사를 위해 처음에 false로 받아준다.
		 
			
			//위에 받은 값들의 유효성 검사 진행 
			if (id==''){
				alert("아이디를 입력해 주세요");
				f.id.focus();
			}else if (f.dbCheckId.value =="idUncheck"){
				alert("아이디 중복체크를 해주세요 ");
			}else if (pwd==''){
				alert("비밀번호를 입력하세요 ");
				f.pwd.focus();
			}else if (pwdChk==''){
				alert("비밀번호 재확인 해주세요 ");
				f.pwdChk.focus();
			}else if(name==''){
				alert("이름을 입력 해주세요 ");
				f.name.focus();
			}else if (birth==''){
				alert("생년월일 을 입력해주세요 ");
				f.birth.focus();
			}else if (email==''){
				alert("이메일을 입력해주세요 ");
				f.email.focus();
			}else if (tel==''){
				alert("번호를 입력해주세요");
				f.tel.focus();
			}else if (memberAddr1=='' || memberAddr2==''){
				alert("주소를 입력해주세요");
				f.memberAddr1.focus();
			}
			
			if (pwd!=pwdChk){
				alert("입력받은 비밀번호가 서로 일치하지 않습니다.")
			}else if (id!='' && pwd!='' && pwdChk!='' && name!='' && birth!='' && email!='' && tel!=''
					  &&memberAddr1!='' && memberAddr2!='' ){
				alert("가입을 축하드립니다.");
				f.submit();
			}
			
		
			function fn_dbCheckId(f){
				var id = f.id.value;
				var url ="dbCheckId.do";
				var param = "id="+id;
				if (id.length == 0 || id == "") {
					alert("아이디를 입력해주세요.");
					f.id.focus();
				} else {
					sendRequest(url, param,dbChkId,"post");
				}
			}
			function dbChkId(){
				if (xhr.readyState == 4 && xhr.status == 200) {
					var data = xhr.responseText;
					var json = eval(data);
					if (json[0].param == 'yes') {
						alert('사용할 수 있는 아이디 입니다.');
						document.join.idDuplication.value = "idCheck";
						//join.jsp현재 파일의 하단 body영역에서 idDuplicationd으로 준 name의 value 값을 idcheck로 바꾼다.
						document.getElementById('id_ok').style.display = 'block';
						//위 idcheck로 중복체크를 하였으니 아래 영역의 id로 지정된 id.ok를  style.display="block"를통해 
						//span영역의 글을 표시해준다.
						document.getElementById('id_already').style.display = 'none';
						//위의 방식과 동일하게 사용가능한 아이디를 json를통해 받았으니 id_already의 span 부분은 style.display = 'none';
						//으로 span영역을 안보이게 해둔다 .
					} else {
						alert('이미 존재하는 아이디 입니다.');
						document.getElementById('id_already').style.display = 'block';
						// 중복체크를 하였으나 아이디가 존재하니 id='id_already'라는 아래 영역의   style.display="block"를통해 
						//span영역의 글을 표시해준다.
						document.getElementById('id_ok').style.display = 'none';
						//위의 방식과 동일하게  이미 아이디가 있으니 id='id_ok' 영역은 style.display = 'none';으로 안보이게 해준다.
					}
				}
			}
			function execution_daum_address(){
				new daum.Postcode({
					
				}
			}
		 }	
			</script>
	</head>
	<body>
		<form>
			<!-- 메인상표 -->
			<h1>FIND</h1>
			<div>
				<p>아이디</p>
				<input name="id" id="id" type="text" placeholder="아이디를 입력해주세요">
				<!-- 아이디 중복확인 -->
				<button type="button" onclick="fn_dbCheckId(this.form)" name="dbCheckId" class="checkId">
					중복확인
				</button>
				<!-- 아이디 중복확인 체크여부 -->
				<input type="hidden" name="idDuplication" value="idUncheck">
				<span id="id_ok">사용 가능한 아이디입니다.</span>
				<span id="id_already">이미 존재하는 아이디 입니다.</span>
			</div>
			<!-- 비밀번호 입력 -->
			<div>
				<p>비밀번호</p>
				<input name="pwd"  type="password" placeholder="비밀번호를 입력해주세요">
			</div>
			<div>
				<p>비밀번호 재확인</p>
				<input name="pwdChk" type="password" placeholder="비밀번호를 다시 입력해주세요">
			</div>
			<!-- 이름 입력 -->
			<div>
				<p>이름</p>
				<input name="name" type="text">
			</div>
			<!-- 생년월일 -->
			<div>
				<p>생년월일</p>
				<input name="birth" type="text" placeholder="6자리 입력해주세요(예:950118)">
			</div>
			<!-- 이메일 입력 -->
			<div>
				<p>이메일</p>
				<input name="email" type="text" placeholder="이메일을 입력해주세요">
			<!-- 이메일 형식이 올바르지 않을 경우 뜨는 경고글 -->
			<span class="mail_input_box_warn" style="display: none;"></span>
			</div>
			<!-- 휴대폰 번호 입력  -->
			<div>
				<p>휴대폰 번호</p>
				<input name="tel" type ="text" placeholder="- 없이 번호 만 입력해주세요 ">
			</div>
			<!-- 주소 입력 -->
		<div class="address_wrap">
			<div class="address_name">주소</div>
			<div class="address_input_1_wrap">
				<div class="address_input_1_box">
					<input class="address_input_1" name="memberAddr1" readonly="readonly"><!--??  -->
				</div>
				<div class="address_button" onclick="execution_daum_address()">
					<span>주소 찾기</span>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="address_input_2_wrap">
				<div class="address_input_2_box">
					<input class="address_input_2" name="memberAddr2" readonly="readonly">
				</div>
			</div>
			<div class="address_input_3_wrap">
				<div class="address_input_3_box">
					<input class="address_input_3" name="memberAddr3" readonly="readonly">
				</div>
			</div>
		</div>
		<!-- 가입하기 버튼 -->
		<input type="button" value="가입하기" onclick="join(this.form)">
		</form>
	</body>
</html>