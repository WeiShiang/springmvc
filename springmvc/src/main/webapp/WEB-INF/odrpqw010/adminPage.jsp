<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to JournalDEV Tutorials</h3>
	<h3>Admin Page</h3>

	<c:url value="/logout" var="logoutUrl" />
	<form id="logout" action="${logoutUrl}" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	
<!-- 			<a href="javascript:document.getElementById('logout').submit()">Logout</a> -->
		<a href="http://localhost:8080/feib/odm/logoutPage?error=error" >Logout</a>
</body>
</html>
