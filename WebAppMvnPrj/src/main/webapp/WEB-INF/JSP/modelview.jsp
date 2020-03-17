<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:forEach var="cty" items="${myList}">
	<li>${cty}</li>
</c:forEach>

<c:forEach var="map" items="${map}">
	<li>${map}</li>
</c:forEach>