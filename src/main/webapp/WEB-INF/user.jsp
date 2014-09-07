<%--
  Created by IntelliJ IDEA.
  User: Алёна
  Date: 07.09.2014
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<pre>

${user.toString()} <br>

</pre>
<a href="${pageContext.request.contextPath}/logout">Log out</a>
<br>
<a href="${pageContext.request.contextPath}/makeOrder">Make order</a>
</body>
</html>
