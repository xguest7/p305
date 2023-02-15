<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>범위 만큼 개수 랜덤 숫자 결과</title>
</head>
<body>

<c:forEach items="${rnum}" var="num">
	${num }  
</c:forEach>



</body>
</html>