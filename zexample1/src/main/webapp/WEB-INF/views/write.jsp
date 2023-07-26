<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/write" method="post">
		닉네임:<input type="text" name="nickname" value="spring">
		제목:<input type="text" name="title" value="예제">
		내용:<input type="text" name="content" value="예제 글">
		<button>작성하기</button>
	</form>
</body>
</html>