<%--
  Created by IntelliJ IDEA.
  User: gkdlf
  Date: 2026-04-21
  Time: 오후 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTER</title>
</head>
<body>
    <h1>REGISTER</h1>
    <form action="/todo/register" method="post">
        <table>
            <tr>
                <th>고유번호</th>
                <td><input type="number" name="num"></td>
            </tr>
            <tr>
                <th>이름</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>날짜</th>
                <td><input type="date" name="day"></td>
            </tr>
        </table>
        <button type="submit">등록 하기</button>
    </form>
</body>
</html>
