package jaden.spring.web.user;


import jaden.spring.web.user.impl.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;

@Controller //handlerMapping
public class LoginController  {
    @RequestMapping(value = "/login.do", method = RequestMethod.GET) //handlerAdapter
    public String loginView(UserVO vo){
        System.out.println("로그인 화면으로 이동");
        vo.setId("test");
        vo.setPassword("test");
        return "login.jsp";
    }
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
        System.out.println("로그인 처리");
        if(vo.getId()== null || vo.getId().equals("")){
            throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
        }
        // 3. 화면 네비게이션
        UserVO user = userDAO.getUser(vo);
        if(user != null){
            session.setAttribute("userName", user.getName());
           return "getBoardList.do";
        } else
            return "login.jsp";

    }
}
