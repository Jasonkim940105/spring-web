package jaden.spring.web.user;


import jaden.spring.web.user.impl.UserDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("로그인 처리");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        UserDAO userDAO = new UserDAO();
        UserVO user = userDAO.getUser(vo);
        // 3. 화면 네비게이션

        ModelAndView mav = new ModelAndView();
        if(user != null){
            mav.setViewName("getBoardList.do");
        } else
            mav.setViewName("login.jsp");
        return mav;
    }
}