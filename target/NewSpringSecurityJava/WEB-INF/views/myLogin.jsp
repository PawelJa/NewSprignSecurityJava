<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body onload='document.loginForm.username.focus();'>
<c:if test="${param.error != null}">
    asd
</c:if>
<form method="post" action="/mylogurl">
    <label>Użytkownik</label>
    <input type="text" id="user" placeholder="użytkownik" name="myUser" required autofocus>
    <label>Hasło</label>
    <input type="password" id="inputPassword" name="myPass" required>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">zaloguj</button>
</form>

</body>
</html>
