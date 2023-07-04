<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
성공
<ui>

    <li>id= ${member.id}</li>
    <li>name= ${member.username}</li>
    <li>age= ${member.age}</li>
</ui>
<a href="/index.html">메인</a>
</body>
</html>