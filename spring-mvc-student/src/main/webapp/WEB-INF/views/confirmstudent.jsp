<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	First Name: ${student.firstName} 
	<br/><br/>
	Last Name: ${student.lastName}
	<br/><br/>
	Age: ${student.age}
	<br/><br/>
	country: ${student.country} 
	<br/><br/>
	favoriteLanguage: ${student.favoriteLanguage}
	<br/><br/>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul> 
</body>
</html>