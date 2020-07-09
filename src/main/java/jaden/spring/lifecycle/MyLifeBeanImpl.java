package jaden.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class MyLifeBeanImpl implements MyLifeBean, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String greeting;
    private String beanName;
    private BeanFactory beanFactory;

    public MyLifeBeanImpl() {
        System.out.println("1. 빈의 생성자 실행");
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
        System.out.println("2. 빈의 setter 메소드 실행");
    }

    @Override
    public void sayHello() {
        System.out.println(greeting + beanName + " !!!");
    }

    @Override //BeanNameAware
    public void setBeanName(String beanName) {
        System.out.println("3. 빈 이름 설정");
        this.beanName = beanName;
        System.out.println("---> " + this.beanName);
    }

    @Override //BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. 빈 팩토리 설정");
        this.beanFactory = beanFactory;
        System.out.println("---> " + this.beanFactory.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. Property 설정 완료");
    }

    public void init(){
        System.out.println("7. 초기화 메소드 실행");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("종료");
    }
}
