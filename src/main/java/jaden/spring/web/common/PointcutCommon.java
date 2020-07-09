package jaden.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class PointcutCommon {
    @Pointcut("execution(* jaden.spring.web..*Impl.*(..))")
    public void allPointCut(){}

    @Pointcut("execution(* jaden.spring.web..*Impl.get*(..))")
    public void getPointCut(){}

}
