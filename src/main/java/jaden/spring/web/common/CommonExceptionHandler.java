package jaden.spring.web.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("jaden.spring.web")
public class CommonExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handlerArithmeticException(Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.setViewName("/common/arithmeticError.jsp");
        return mav;
    }

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView handlernullPointerException (Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.setViewName("/common/nullPointerError.jsp");
        return mav;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handlerexception (Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.setViewName("/common/error.jsp");
        return mav;
    }
}
