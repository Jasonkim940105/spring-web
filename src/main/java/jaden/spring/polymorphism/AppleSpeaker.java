package jaden.spring.polymorphism;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component @Primary
public class AppleSpeaker implements Speaker{
    public AppleSpeaker() {
        System.out.println("===> AppleSpeaker 인스턴스 생성");
    }

    public void volumeUp() {
        System.out.println("AppleSpeaker --- 소리 올린다.");
    }

    public void volumeDown() {
        System.out.println("AppleSpeaker --- 소리 내린다.");
    }
}
