package jaden.spring.web.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        BoardService boardService = (BoardService)context.getBean("boardService");

        BoardVO vo = new BoardVO();
        vo.setTitle("임시제목");
        vo.setWriter("홍길동");
        vo.setContent("일빠...");
        boardService.insertBoard(vo);
        List<BoardVO> boardList = boardService.getBoardList(vo);
        for(BoardVO board : boardList){
            System.out.println("---> " + board.toString() );
        }

        context.close();

    }
}
