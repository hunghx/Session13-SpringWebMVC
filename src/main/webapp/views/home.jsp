<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/16/2023
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<h1>Trang chủ</h1>
<form action="/form/add" method="post">
    <input type="text" name="name">
    <input type="number" name="age">
    <button type="submit">Add</button>
</form>
</body>
</html>
