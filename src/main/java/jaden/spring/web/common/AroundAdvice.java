package jaden.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

    @Around("jaden.spring.web.common.PointcutCommon.allPointCut()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{  //jounPoint -> 핵심로직
        String method = joinPoint.getSignature().getName();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object returnObj = joinPoint.proceed(); // 핵심로직 수행
        stopWatch.stop();
        System.out.println(method+"() 메소드 수행에 걸린 시간 " + stopWatch.getTotalTimeMillis() + " ms");
        return returnObj;
    }
}
