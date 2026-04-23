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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/list.css">
</head>
<body>
    <div class="main-container">
        <h1><span>TODO LIST</span></h1>

        <div class="table-wrapper">
            <table class="list-table">
                <thead>
                <tr>
                    <th>번호</th>
                    <th>이름</th>
                    <th>날짜</th>
                    <th>관리</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="todo" items="${list}">
                    <tr>
                        <td class="num-col">
                            <a href="${pageContext.request.contextPath}/todo/modify?num=${todo.num}">
                                    ${todo.num}
                            </a>
                        </td>
                        <td>${todo.name}</td>
                        <td>${todo.day}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/todo/remove?num=${todo.num}" class="remove-link">
                                삭제
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="button-group">
            <button type="button" class="btn-style" onclick="location.href='/'">메인으로</button>
            <button type="button" class="btn-style" onclick="location.href='/todo/register'">새 등록</button>
        </div>
    </div>
</body>
</html>
