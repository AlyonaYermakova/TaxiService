<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>

<h1>Hello dear Guest!<br></h1>

<h3>Please log in or register</h3>
<a href="${pageContext.request.contextPath}/login">Sign In</a> <br>
<a href="${pageContext.request.contextPath}/register">Register now!</a>


</body>
</html>