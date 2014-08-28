<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>HOME </h1>
<h2>Welcome, ${user.name}!</h2>
<pre>

${user.toString()} <br>

</pre>
<a href="${pageContext.request.contextPath}/logout">Log out</a>


</body>
</html>
