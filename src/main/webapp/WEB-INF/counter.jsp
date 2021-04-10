<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You visiting your server <c:out value="${count}"/> times.</h1>
<h2><a href="/">Test another visit?</a></h2>
</body>
</html>