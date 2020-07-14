package jaden.spring.web.board.impl;

import jaden.spring.web.board.BoardVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardMapper implements RowMapper<BoardVO> {
    public BoardVO mapRow(ResultSet rs, int i) throws SQLException {
        BoardVO board = new BoardVO();
        board.setSeq(rs.getInt("seq"));
        board.setTitle(rs.getString("title"));
        board.setWriter(rs.getString("writer"));
        board.setContent(rs.getString("content"));
        board.setRegdate(rs.getDate("regdate"));
        board.setCnt(rs.getInt("cnt"));
        return board;

    }
}
