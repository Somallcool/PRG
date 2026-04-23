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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/modify.css">

</head>
<body>
<div class="main-container">
    <h1><span>MODIFY</span></h1>
    <div class="table-style">
        <form action="/todo/modify" method="post">
            <table>
                <tr>
                    <th>고유번호</th>
                    <td><input type="number" name="num" class="input-style" value="${todo.num}" readonly></td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td><input type="text" name="name" class="input-style" value="${todo.name}"></td>
                </tr>
                <tr>
                    <th>날짜</th>
                    <td><input type="date" name="day" class="input-style" value="${todo.day}"></td>
                </tr>
            </table>
            <div class="button-wrapper">
                <button type="submit" class="btn-style">수정 완료</button>
                <button type="button" class="btn-style" onclick="location.href='/todo/list'">취소</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
