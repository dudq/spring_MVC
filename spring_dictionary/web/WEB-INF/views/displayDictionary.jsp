<%--
  Created by IntelliJ IDEA.
  User: du
  Date: 18/11/2019
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form method="get" action="/translate">
    <h3>English</h3>
    <input name="eng" type="text" value="${eng}">
    <h3>Vietnamese</h3>
    <input name="viet" type="text" value="${viet}">
    <input type="submit" value="Translate">
</form>
</body>
</html>
