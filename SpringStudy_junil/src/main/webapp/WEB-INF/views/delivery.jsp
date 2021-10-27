<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="delivery-request" method="post">
		배송 받을 사람(이름) <input type="text" name="customer_name">
		배송지(주소) <input type="text" name="customer_addr">
		연락처 <input type="tel" name="customer_phone">
		택배기사님께 요청사항 <input type="text" name="customer_etc">
		<input type="submit" value="주문하기">
	</form>
	
1. 배송 받을 사람(이름) 	customer_name
2. 배송지(주소)			customer_addr
3. 연락처					customer_phone
4. 택배기사님께 요청사항		customer_etc
서브밋(form의 action = delivery-request)
controller 명 DeliveryController
Model객체명 CustomerModel

view(jsp) 파일로 반환
deliveryInfo.jsp
고객명: 김준일
배송지(주소): 부산광역시 동래구 ~~~
고객 연락처: 010-9988-1916
요청사항: 문 앞에 두고 가주세요.
</body>
</html>