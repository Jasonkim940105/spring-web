package jaden.spring.web.user.impl;

import jaden.spring.web.common.JDBCUtil;
import jaden.spring.web.user.UserVO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private final String USER_GET = "select * from myuser where id = ? and password = ?";

    public UserVO getUser(UserVO vo){
        UserVO user = null;
            try {
                con = JDBCUtil.getConnection();
                pstmt = con.prepareStatement(USER_GET);
                pstmt.setString(1, vo.getId());
                pstmt.setString(2, vo.getPassword());
                rs = pstmt.executeQuery();
                while (rs.next()){
                    user = new UserVO();
                    user.setId(rs.getString("id"));
                    user.setPassword(rs.getString("password"));
                    user.setName(rs.getString("name"));
                    user.setRole(rs.getString("role"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtil.close(rs, pstmt, con);
            }
        return user;
    }
}
