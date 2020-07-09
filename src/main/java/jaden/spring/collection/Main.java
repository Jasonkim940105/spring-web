package jaden.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");

        NumberList numlist = (NumberList)ctx.getBean("phoneNumlist");

        List<String> numbers = numlist.getPhoneNumList();

        for(String number : numbers){
            System.out.println(number);
        }



    }
}
