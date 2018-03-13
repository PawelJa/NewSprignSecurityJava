<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="#">
    <label>Użytkownik</label>
    <input type="text" id="user" placeholder="użytkownik" name="username" required autofocus>
    <label>Hasło</label>
    <input type="text" id="inputPassword" name="password" required>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">zaloguj</button>
</form>

</body>
</html>
