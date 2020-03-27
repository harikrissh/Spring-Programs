<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
<!-- EXTERNAL CSS AND JS -->
<!-- C:URL ONLY FOR ASSIGING RESOURCES PATH -->
    <link href="<c:url value="/resources/css/mycss.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/do.js" />"></script>
</head>
<body>
    <h2>Hi this style is defined in css file</h2>
    <input type="button" onclick="do11()" value="Click Me" />
 <img height = 400 width=600 src="<c:url value="/resources/images/417263.jpg"></c:url>"/>	
 </body>
</html>