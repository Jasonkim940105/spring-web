/*
package jaden.spring.web.user;

import jaden.spring.web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("로그아웃 처리");
        HttpSession session = request.getSession(false);
        session.invalidate();

        return "login";

    }
}
*/