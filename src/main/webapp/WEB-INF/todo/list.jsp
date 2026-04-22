<%--
  Created by IntelliJ IDEA.
  User: gkdlf
  Date: 2026-04-21
  Time: 오후 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>LIST</title>
</head>
<body>
    <h1>LIST</h1>
    <div>
        <table>
            <tr>
                <th>번호</th>
                <th>이름</th>
                <th>날짜</th>
            </tr>
            <c:forEach var="todo" items="${list}">
                <tr>
                    <td>
                        <a href="${pageContext.request.contextPath}/todo/modify?num=${todo.num}">
                            ${todo.num}
                        </a>
                    </td>
                    <td>${todo.name}</td>
                    <td>${todo.day}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/todo/remove?num=${todo.num}">
                            삭제하기
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="/">메인으로</a>
        <a href="/todo/register">REGISTER</a>
    </div>
</body>
</html>
