package jaden.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBeanCli {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        CollectionBean bean = (CollectionBean)context.getBean("collectionBean");

        Map<String,String> addrList = bean.getAddressList();

        Properties addrProps = bean.getAddressProps();

        Set<String> addrSet = bean.getAddressSet();

        for(String key : addrList.keySet()){
            System.out.println(String.format("키 : %s, 값 : %s", key, addrList.get(key)));
        }

        System.out.println("---");

        for(String key : addrProps.stringPropertyNames()){
            System.out.println(String.format("키 : %s, 값 : %s", key, addrProps.get(key)));
        }

        for(String address : addrSet){
            System.out.println(address);
        }

    }
}
