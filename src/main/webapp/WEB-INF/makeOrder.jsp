<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Make Order</title>
</head>
<body>
<form method="post">
<h1>Make Order</h1>
Tariff: <input type="text" name="carType" >
<br>
Your name: <input type="text" name="name" value=${user.name}>
<br>
Address: <input type="text" name="address" >
<br>
Phone number: <input type="text" name="phoneNumber" >
<br>
Note: <input type="text" name="note">
<br>
<input type="submit" value="Make order">
</form>
</body>
</html>
