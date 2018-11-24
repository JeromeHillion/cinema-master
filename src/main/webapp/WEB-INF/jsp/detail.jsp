<%--
  Created by IntelliJ IDEA.
  User: Gideon
  Date: 24/11/2018
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Film</title>
</head>
<body>
<h1>film</h1>
<p/>
<hr width="100%"/>

<form>
    <fieldset>
        <legend>Film</legend>
        <figure>
            <img src="affiche?id=${film.id}"
                 width="300" height="300"
                 alt="Affiche de ${film.titre}">
            <figcaption>${film.titre}</figcaption>
        </figure>
        <label for="note">Note :</label>
        <input style="background-color: aqua;"
               size="4" id="note" type="text"
               value="${film.note}"/>
    </fieldset>
</form>

</body>
</html>