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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
    <div class="main-container">
        <h1><span>REGISTER</span></h1>
        <div class="table-style">
            <form action="/todo/register" method="post">
                <table>
                    <tr>
                        <th>고유번호</th>
                        <td><input type="number" name="num" class="input-style" placeholder="번호를 입력하세요"></td>
                    </tr>
                    <tr>
                        <th>이름</th>
                        <td><input type="text" name="name" class="input-style" placeholder="이름을 입력하세요"></td>
                    </tr>
                    <tr>
                        <th>날짜</th>
                        <td><input type="date" name="day" class="input-style"></td>
                    </tr>
                </table>
                <div class="button-wrapper">
                    <button type="button" class="btn-style" onclick="location.href='/'">메인으로</button>
                    <button type="submit" class="btn-style">등록 하기</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
