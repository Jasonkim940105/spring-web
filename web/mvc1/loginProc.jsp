<%@ page import="jaden.spring.web.user.UserVO" %>
<%@ page import="jaden.spring.web.user.impl.UserDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");

    UserVO vo = new UserVO();
    vo.setId(id);
    vo.setPassword(password);

    UserDAO userDAO = new UserDAO();
    UserVO user = userDAO.getUser(vo);

    if(user != null){
        response.sendRedirect("getBoardList.jsp");
    } else
        response.sendRedirect("login.jsp");
%>

