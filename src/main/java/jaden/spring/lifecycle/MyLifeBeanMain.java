package jaden.spring.lifecycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MyLifeBeanMain {
    public static void main(String[] args) {
        /*FileSystemResource resource = new FileSystemResource("src/main/resources/applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        factory.addBeanPostProcessor(new CustomBeanPostProcessor());
    */
        AbstractApplicationContext applicationContext = new GenericXmlApplicationContext("applicationContext.xml");

        MyLifeBean bean = (MyLifeBean)applicationContext.getBean("myLifeBean");
        bean.sayHello();

        applicationContext.close();
    }
}
