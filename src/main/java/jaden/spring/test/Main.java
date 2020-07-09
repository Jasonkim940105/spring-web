package jaden.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        Test test = (Test)ctx.getBean("test");
        System.out.println(test.name);

    }
}
