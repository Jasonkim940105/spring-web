package jaden.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Test test(){
        Test test = new Test();
        test.name = "jaden";
        return test;
    }


}
