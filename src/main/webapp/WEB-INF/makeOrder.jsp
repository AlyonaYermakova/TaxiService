<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Make Order</title>
</head>
<body>
<form method="post">
<h1>Make Order</h1>
    <label>
        <select required name="role">
            <option selected="selected" value="economy">Economy</option>
            <option value="comfort">Comfort</option>
            <option value="premium">Premium</option>
        </select>
    </label>
Your name: <input type="text" name="name" value=${user.name}>
<br>
Address: <input type="text" name="address" ${address.street}>
<br>
Phone number: <input type="text" name="phoneNumber" ${address.phoneNumber}>
<br>
Note: <input type="text" name="note">
<br>
<input type="submit" value="Make order">
</form>
</body>
</html>
