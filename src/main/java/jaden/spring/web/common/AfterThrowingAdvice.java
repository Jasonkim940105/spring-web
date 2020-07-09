package jaden.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AfterThrowingAdvice {

    @AfterThrowing(pointcut = "PointcutCommon.allPointCut()", throwing = "e")
    public void exceptionLog(JoinPoint joinPoint, Exception e){
        String method = joinPoint.getSignature().getName();
        System.out.println("[예외처리] : " + method + "() 메소드 수행 중 발생된 예외메세지 " + e.getMessage());
    }
}
