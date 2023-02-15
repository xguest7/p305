<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>범위 만큼 갯수 램덤숫자 결과</title>
</head>
<body>
<%
String[] s=(String[])request.getAttribute("rnum");
for(String r :s){ %>
<%= r %>
<% }%>

</body>
</html>