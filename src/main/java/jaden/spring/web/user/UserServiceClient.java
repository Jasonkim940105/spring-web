package jaden.spring.web.user;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient  {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)context.getBean("userService");

        UserVO vo = new UserVO();
        vo.setId("jaden");
        vo.setPassword("spring");

        UserVO user = userService.getUser(vo); //-> userDAO.getUser

        if(user != null){
            System.out.println(user.getName() + " 님 환영합니다 ");
        } else {
            System.out.println("로그인 실패");
        }

        context.close();

    }
}
