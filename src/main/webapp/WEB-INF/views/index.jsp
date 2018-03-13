<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
Zalogowany użytkownik:
<c:choose>
    <c:when test="${user==null}">
        niezalogowany
    </c:when>
    <c:otherwise>
        ${user}
    </c:otherwise>
</c:choose>

<br>
<form method="post" action="/logout">
    <button type="submit">wyloguj !</button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
