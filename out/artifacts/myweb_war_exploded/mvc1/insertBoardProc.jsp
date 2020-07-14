<%@ page import="jaden.spring.web.board.BoardVO" %>
<%@ page import="jaden.spring.web.board.impl.BoardDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String content = request.getParameter("content");

    //2 데이터 베이스 연동 처리
    BoardVO vo = new BoardVO();
    vo.setTitle(title);
    vo.setWriter(writer);
    vo.setContent(content);

    BoardDAO boardDAO = new BoardDAO();
    boardDAO.insertBoard(vo);

    //3. 화면 네비게이션
    response.sendRedirect("getBoardList.jsp");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
