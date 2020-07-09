package jaden.spring.web.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {

    @After("jaden.spring.web.common.PointcutCommon.allPointCut()")
    public void finalLog(){
        System.out.println("[사후처리-무조건] : 비즈니스 로직 수행 후 무조건 동작");
    }
}
