package jaden.spring.web.board.impl;

import jaden.spring.web.board.BoardVO;
import jaden.spring.web.common.JDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("boardDAO")
public class BoardDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from myboard), ?, ?, ?)";
    // select nvl(max(seq), 0) -> nvl(값, 지정값) 함수는 값이 null 인경우 지정값 출력 값이 null 아니면 그냥 출력
    private final String BOARD_UPDATE = "update myboard set title=?, content=? where seq=?";
    private final String BOARD_DELETE = "delete myboard where seq=?";
    private final String BOARD_GET = "select * from myboard where seq=?";
    private final String BOARD_LIST = "select * from myboard order by seq desc";

    public void insertBoard(BoardVO vo){
        System.out.println("JDBC로 insertBoard() 기능 처리");
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(BOARD_INSERT);
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getWriter());
            pstmt.setString(3, vo.getContent());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
    }

    public void updateBoard(BoardVO vo){
        System.out.println("JDBC로 updateBoard() 기능 처리");
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(BOARD_UPDATE);
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getContent());
            pstmt.setInt(3, vo.getSeq());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
    }

    public void deleteBoard(BoardVO vo){
        System.out.println("JDBC로 deleteBoard() 기능 처리");
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(BOARD_DELETE);
            pstmt.setInt(1, vo.getSeq());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
    }

    public BoardVO getBoard(BoardVO vo){
        System.out.println("JDBC로 getBoard() 기능 처리");
        BoardVO board = null;
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(BOARD_GET);
            pstmt.setInt(1, vo.getSeq());
            rs = pstmt.executeQuery();
            if(rs.next()){
                board = new BoardVO();
                board.setSeq(rs.getInt("seq"));
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));
                board.setContent(rs.getString("content"));
                board.setRegdate(rs.getDate("regdate"));
                board.setCnt(rs.getInt("cnt"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, conn);
        }
        return board;
    }

    public List<BoardVO> getBoardList(BoardVO vo){
        System.out.println("JDBC로 getBoardList() 기능 처리");
        List<BoardVO> boardList = new ArrayList<BoardVO>();

        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement(BOARD_LIST);
            rs = pstmt.executeQuery();
            while (rs.next()){
                BoardVO board = new BoardVO();
                board.setSeq(rs.getInt("seq"));
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));
                board.setContent(rs.getString("content"));
                board.setRegdate(rs.getDate("regdate"));
                board.setCnt(rs.getInt("cnt"));
                boardList.add(board);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, conn);
        }
        return boardList;
    }


}
