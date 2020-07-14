<%--
  Created by IntelliJ IDEA.
  User: jhkim
  Date: 2020-07-08
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<form action="login.do" method="post">
    <table border="1">
        <tr>
            <td>아이디</td>
            <td><input type="text" name="id" value="${userVO.id}"></td>
        </tr>
        <tr>
            <td>패스워드</td>
            <td><input type="password" name="password" value="${userVO.password}" }></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="로그인"></td>
        </tr>
    </table>
</form>
</body>
</html>
