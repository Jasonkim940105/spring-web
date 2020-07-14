package jaden.spring.web.board;

import jaden.spring.web.board.impl.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @ModelAttribute("conditionMap")
    public Map<String ,String> searchConditionMap(){
        Map<String, String> conditionMap = new HashMap<>();
        conditionMap.put("제목", "title");
        conditionMap.put("내용", "content");
        return conditionMap;
    }
    @RequestMapping("/insertBoard.do") //HandlerMapping 을 대체한다.
    public String insertBoard(BoardVO vo, HttpServletRequest request) throws IOException {  // 폼파일의 name 과 vo 객체의 프로퍼티들이 이름을 기준으로 맵핑
        System.out.println("글 등록 처리");
        String path = request.getServletContext().getRealPath("/");
        System.out.println(path);
        MultipartFile uploadFile = vo.getUploadFile();
        if(!uploadFile.isEmpty()){
            String fileName = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("/Users/jhkim/Desktop/myweb/" + fileName));
        }
        boardService.insertBoard(vo);
        return "getBoardList.do";
    }
    @RequestMapping("/updateBoard.do")
    public String updateBoard(@ModelAttribute("board") BoardVO vo){
        System.out.println("글 수정 처리");
        boardService.updateBoard(vo);
        return "getBoardList.do";
    }
    @RequestMapping("/deleteBoard.do")
    public String deleteBoard(BoardVO vo) {
        System.out.println("글 삭제 처리");
        boardService.deleteBoard(vo);
        return "redirect:getBoardList.do";
    }
    @RequestMapping("/getBoard.do")
    public String getBoard(BoardVO vo, Model model) {
        System.out.println("글 상세 보기 처리");
        BoardVO board = boardService.getBoard(vo);
        model.addAttribute("board", board);
        return "getBoard.jsp";
    }
    @RequestMapping("/getBoardList.do")
    public String getBoardList(
            /*@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
            @RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,*/
            BoardVO vo, Model model) {
        System.out.println("글 목록 보기 처리");
        if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
        if(vo.getSearchKeyword()==null) vo.setSearchKeyword("");
        List<BoardVO> boardList = boardService.getBoardList(vo);
        model.addAttribute("boardList", boardList);
        return "getBoardList.jsp";
    }

    @RequestMapping("/dataTransform.do")
    @ResponseBody
    public BoardListVO dataTransform(BoardVO vo) {
        System.out.println("글 목록 변환 처리");
        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardService.getBoardList(vo);
        BoardListVO boardListVO = new BoardListVO();
        boardListVO.setBoardList(boardList);
        return boardListVO;
    }
}
