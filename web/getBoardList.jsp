<%@ page import="jaden.spring.web.board.BoardVO" %>
<%@ page import="jaden.spring.web.board.impl.BoardDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Board List</title>
</head>
<body>
<h1>글 목록 </h1>
<h3>테스트 회원님 환영합니다 <a href="logout.do">LOG-OUT</a> </h3>
<form action="getBoardList.jsp" method="post">
    <table border="1">
        <tr>
            <td>
                <select name="searchCondition">
                    <option value="TITLE">제목</option>
                    <option value="CONTENT">내용</option>
                </select>
                <input type="text" name="searchKeyword" />
                <input type="submit" value="검색" />
            </td>
        </tr>
    </table>
</form>
<br>
<table border="1">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>등록일</th>
        <th>조회수</th>
    </tr>
    <c:forEach var="board" items="${boardList}">
    <tr>
        <td>${board.seq}</td>
        <td>
            <a href="getBoard.do?seq=${board.seq}">${board.title}</a>
        </td>
        <td>${board.writer}</td>
        <td>${board.regdate}</td>
        <td>${board.cnt}</td>
    </tr>
    </c:forEach>

</table>

<br>
<a href="insertBoard.jsp">새글 작성</a>
</body>
</html>
