<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	<label>아이디</label> <input type="text" id="signUp_id"> <button type="button" id="id_check_btn">중복확인</button>
	
	<script type="text/javascript">
		const id_check_btn = document.querySelector("#id_check_btn");
		
		id_check_btn.onclick = () => {
			$.ajax({
				type: "post",
				url: "idCheck",
				data: {
					user_email: document.querySelector("#signUp_id").value
				},
				dataType: "text",
				success: function(data){
					if(data == 0) {
						alert("사용가능한 아이디입니다.");
					}else if(data == 1){
						alert("이미 존재하는 아이디입니다.");
					}
				},
				error: function(){
					alert("비동기처리 오류");
				}
			})
		}
	</script>
</body>
</html>