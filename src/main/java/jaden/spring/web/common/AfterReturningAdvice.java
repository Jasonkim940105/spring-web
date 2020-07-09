package jaden.spring.web.common;

import jaden.spring.web.user.UserVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AfterReturningAdvice {

    @AfterReturning(pointcut = "PointcutCommon.getPointCut()", returning = "returnObj")
    public void afterLog(JoinPoint joinPoint, Object returnObj) {
        String method = joinPoint.getSignature().getName();
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if (user.getRole().equals("admin")) {
                System.out.println("[사후처리] " + user.getName() + "로그인 (Admin) ");
            }
        }
    }
}
