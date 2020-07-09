package jaden.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("tv")
public class LgTV implements TV{
    @Autowired
    private Speaker speaker;

    public void powerOn(){
        System.out.println("LgTV 전원을 킨다");
    }
    public void powerOff(){
        System.out.println("LgTV 전원을 끈다");
    }
    public void volumeUp(){
        speaker.volumeUp();
    }
    public void volumeDown() {
        speaker.volumeDown();
    }

}
