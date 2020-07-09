<%--
  Created by IntelliJ IDEA.
  User: jhkim
  Date: 2020-07-08
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Board</title>
</head>
<body>
<h1>글 등록</h1>
<a href="logout.do">LOG-OUT</a><hr>
<form action="insertBoard.do" method="post">
    <table border="1">
        <tr>
            <td>제목</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><textarea name="content"></textarea> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="새글 등록"> </td>
        </tr>
    </table>
</form>
<a href="getBoardList.jsp">글 목록으로 가기</a>

</body>
</html>
