<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="proccessform" modelAttribute="student">
	First Name: <form:input path="firstName" />
		<br />
		<br />
	Last Name: <form:input path="lastName" />

		<br />
		<br />
	Country: 
	<form:select path="country">
			<form:options items="${student.countryList}"/>
		</form:select>
		<br />
		<br />
		Favorite Language:
	Java<form:radiobutton path="favoriteLanguage" value="java"/>
	C#<form:radiobutton path="favoriteLanguage" value="c#"/>
	Python<form:radiobutton path="favoriteLanguage" value="python"/>
	PHP<form:radiobutton path="favoriteLanguage" value="php"/>
		<br />
		<br />
		<input type="submit" value="Submit" />
	</form:form>
	
</body>
</html>