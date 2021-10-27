<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	고객명: ${customerModel.customer_name }
	배송지(주소): ${customerModel.customer_addr }
	고객 연락처: ${customerModel.customer_phone }
	요청사항: ${customerModel.customer_etc }
</body>
</html>