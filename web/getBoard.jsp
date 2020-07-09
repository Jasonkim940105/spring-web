<%@ page import="jaden.spring.web.board.BoardVO" %>
<%@ page import="jaden.spring.web.board.impl.BoardDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Board Articel Content</title>
</head>
<body>
<h1>글 상세</h1>
<a href="logout.do">Log Out</a><hr>
<form action="updateBoard.do" method="post">
    <input name="seq" type="hidden" value="${board.seq}"/>
    <table border="1">
        <tr>
            <td>제목</td>
            <td><input name="title" type="text" value="${board.title}"></td>
        </tr>
        <tr>
            <td>작성자</td>
            <td>${board.writer}</td>
        </tr>
        <tr>
            <td>내용</td>
            <td><textarea name="content">${board.content}</textarea> </td>
        </tr>
        <tr>
            <td>등록일</td>
            <td>${board.regdate}</td>
        </tr>
        <tr>
            <td>조회수</td>
            <td>${board.cnt}</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="글 수정"></td>
        </tr>
    </table>
</form><hr>
<a href="insertBoard.jsp">글 등록</a>
<a href="deleteBoard.do?seq=${board.seq}>글 삭제</a>
<a href="getBoardList.do">글 목록</a>

</body>
</html>
