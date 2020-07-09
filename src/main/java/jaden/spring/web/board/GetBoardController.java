/*
package jaden.spring.web.board;

import jaden.spring.web.board.impl.BoardDAO;
import jaden.spring.web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetBoardController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("글 상세 보기 처리");
        String seq = request.getParameter("seq");
        BoardVO vo = new BoardVO();
        vo.setSeq(Integer.parseInt(seq));

        BoardDAO boardDAO = new BoardDAO();
        BoardVO board = boardDAO.getBoard(vo);

        HttpSession session = request.getSession();
        session.setAttribute("board", board);
        return "getBoard";
    }
}
*/
