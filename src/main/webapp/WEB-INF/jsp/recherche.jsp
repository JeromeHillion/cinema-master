<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Gideon
  Date: 24/11/2018
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Recherche</title>
</head>
<body>
<c:forEach items="${films}" var="film">
    <a href=/detail?id=${film.id}>${film.titre} (${film.note})</a>
    <br />
</c:forEach>
</body>
</html>
