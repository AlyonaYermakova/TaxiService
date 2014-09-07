<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h2>Please, enter your login and password</h2>

<form form action="${pageContext.request.contextPath}/login" method="post">
    Username: <input type="text" name="login">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit" value="Login">


</form>
</body>
</html>
