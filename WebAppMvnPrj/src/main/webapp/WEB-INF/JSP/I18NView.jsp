<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h2>${msg}</h2>

<a id="en" href="/WebAppMvnPrj/i18n?lang=en">English</a><br>
<a id="fr" href="/WebAppMvnPrj/i18n?lang=fr">French</a><br>
<spring:message code="greeting"></spring:message>