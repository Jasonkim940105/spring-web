package jaden.spring.polymorphism;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class SonySpeaker implements Speaker{
    public SonySpeaker() {
        System.out.println("===> SonySpeaker 인스턴스 생성");
    }
    public void volumeUp(){
        System.out.println("SonySpeaker ---- 소리 올린다.");
    }
    public void volumeDown(){
        System.out.println("SonySpeaker ---- 소리 내린다.");
    }
}
