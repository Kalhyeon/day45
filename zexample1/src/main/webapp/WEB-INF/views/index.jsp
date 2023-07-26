<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Hello Spring</p>
	<form action="/test1" method="post">
		<input type="text" name="name" value="홍길동">
		<button>서버로 보내기1</button>
	</form>
	
	<form action="/test2" method="post">
		<input type="text" name="age" value="21">
		<button>서버로 보내기2</button>
	</form>
</body>
</html>