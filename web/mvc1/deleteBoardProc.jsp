<%@ page import="jaden.spring.web.board.BoardVO" %>
<%@ page import="jaden.spring.web.board.impl.BoardDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String seq = request.getParameter("seq");

    BoardVO boardVO = new BoardVO();
    boardVO.setSeq(Integer.parseInt(seq));
    BoardDAO boardDAO = new BoardDAO();
    boardDAO.deleteBoard(boardVO);

    response.sendRedirect("getBoardList.jsp");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
