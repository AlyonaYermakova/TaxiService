<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>HOME </h1>

<h2>Welcome, ${user.name}!</h2>

<a href="${pageContext.request.contextPath}/logout">Log out</a>
<br>
<a href="${pageContext.request.contextPath}/makeOrder">Make order</a>
<br>
<a href="${pageContext.request.contextPath}/user">User page</a>

</body>
</html>
