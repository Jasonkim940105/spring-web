package jaden.spring.web.common;

import org.springframework.stereotype.Component;

@Component
public class Log4jAdvice {
    public void printLogging(){
        System.out.println("[로그-log4jAdvice] : 비지니스 로직 수행 전 동");
    }
}
