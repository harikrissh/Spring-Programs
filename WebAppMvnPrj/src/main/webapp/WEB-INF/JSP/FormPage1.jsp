<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<form:form action="FormBeanSuccess" modelAttribute="fb">

<label>Name</label><form:input path="name"/><br/>
<label>Gender</label>
<form:radiobutton value="M" path="gender"/><label>Male</label>
<form:radiobutton value="F" path="gender"/><label>Female</label><br/>
<label>Country</label><form:select items="${countryList}" path="country"></form:select><br/>
<label>Hobbies</label>
<label>Cricket</label><form:checkbox path="hobbies" value="Cricket"/><br/>
<label>VolleyBall</label><form:checkbox path="hobbies" value="VolleyBall"/><br/>
<label>Kabbadi</label><form:checkbox path="hobbies" value="Kabbadi"/><br/>

<input type="submit" value="Ok">

</form:form>