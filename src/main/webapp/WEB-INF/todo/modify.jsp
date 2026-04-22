<%--
  Created by IntelliJ IDEA.
  User: gkdlf
  Date: 2026-04-22
  Time: 오후 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MODIFY</title>
</head>
<body>
<h1>MODIFY</h1>
<form action="/todo/modify" method="post">
    <table>
        <tr>
            <th>번호</th>
            <td><input type="number" name="num" value="${todo.num}" readonly></td>
        </tr>
        <tr>
            <th>이름</th>
            <td><input type="text" name="name" value="${todo.name}"></td>
        </tr>
        <tr>
            <th>날짜</th>
            <td><input type="date" name="day" value="${todo.day}"></td>
        </tr>
    </table>
    <button type="submit">수정 완료</button>
    <button type="button" onclick="location.href='/todo/list'">취소</button>
</form>
</body>
</html>
