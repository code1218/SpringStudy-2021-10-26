<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert-data" method="post">
		아이디: <input type="text" name="user-id"><br>
		비밀번호: <input type="password" name="user-password"><br>
		이름: <input type="text" name="user-name"><br>
		연락처: <input type="tel" name="user-phone"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>