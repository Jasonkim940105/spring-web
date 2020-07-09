package jaden.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import java.util.Arrays;
/*

public class BeforeAdvice {
    public void beforeLog(JoinPoint joinPoint) { //JoinPoint 를쓰려면 첫번째 인자로만!

        String method = joinPoint.getSignature().getName(); // 메소드 이름
        Object[] args = joinPoint.getArgs(); // 매개변수를 배열로 받아옴
        System.out.println("[사전처리] : " + method +"() 메소드의 args 정보 : "  + Arrays.toString(args) + " 비즈니스 로직 수행 전 동작");
    }

}
*/
@Service
@Aspect
public class BeforeAdvice{
    @Before("PointcutCommon.allPointCut()")
    public void beforeLog(JoinPoint joinPoint) { //JoinPoint 를쓰려면 첫번째 인자로만!
        String method = joinPoint.getSignature().getName(); // 메소드 이름
        Object[] args = joinPoint.getArgs(); // 매개변수를 배열로 받아옴
        System.out.println("[사전처리] : " + method +"() 메소드의 args 정보 : "  + Arrays.toString(args) + " 비즈니스 로직 수행 전 동작");
    }

}
