<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<body>
Name: ${res.name}
<br/>
Gender: ${res.gender}
<br/>
Country: ${res.country}
<br/>
Hobbies:
<ul>
	<c:forEach var="hobby" items="${res.hobbies}">
		<li>${hobby}</li>
	</c:forEach>
</ul>
</body>
</html>