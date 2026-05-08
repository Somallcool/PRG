<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>main</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
    <main class="main-container">
        <h1><span>MAIN PAGE</span></h1>

        <c:choose>
            <c:when test="${empty loginInfo}">
                <div class="link-wrapper">
                    <a href="/member/login">LOGIN</a>
                    <a href="/member/join">SIGN UP</a>
                </div>
            </c:when>

            <c:otherwise>
                <h2><p class="welcome-msg">${loginInfo.name}님 환영합니다!</p></h2>
                <div class="link-wrapper">
                    <a href="/member/logout">LOGOUT</a>
                    <a href="/todo/register">REGISTER</a>
                    <a href="/todo/list">LIST</a>
                </div>
            </c:otherwise>
        </c:choose>
    </main>
</body>
</html>