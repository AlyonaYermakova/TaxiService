<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="post">
    <h1>Registration page</h1>
    Login: <input type="text" name="login">
    <br>
    Password: <input type="password" name="password">
    <br>
    Name: <input type="text" name="name">
    <br>
    Surname: <input type="text" name="surname">
    <br>
    <%--Role: <input type="text" name="role">--%>
    <%--<br>--%>
    <label>
        <select required name="role">
            <option selected="selected" value="dispatcher">Dispatcher</option>
            <option value="client">Client</option>
        </select>
    </label>
    <input type="submit" value="Register">
</form>
</body>
</html>
