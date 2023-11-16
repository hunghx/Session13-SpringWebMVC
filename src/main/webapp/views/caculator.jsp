<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/16/2023
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator/cal" method="post">
    <input type="text" name="num1" value="${num1}">
    <select name="op">
        <option ${op=='add'?'selected':''} value="add">+</option>
        <option ${op=='minus'?'selected':''} value="minus">-</option>
        <option ${op=='multi'?'selected':''} value="multi">*</option>
        <option ${op=='div'?'selected':''} value="div">/</option>
    </select>
    <input type="text" name="num2" value="${num2}">
    <button type="submit">Tính</button>
    <p>Result : ${rs}</p>
</form>
</body>
</html>
