/*
package jaden.spring.web.board;

import jaden.spring.web.board.impl.BoardDAO;
import jaden.spring.web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteBoardController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("글 삭제 처리");
        String seq = request.getParameter("seq");

        BoardVO boardVO = new BoardVO();
        boardVO.setSeq(Integer.parseInt(seq));
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.deleteBoard(boardVO);

        return "getBoardList.do";
    }
}
*/
