package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy Object Created");
    }

    public void chattingWithGirl() {
        Girl girl = new Girl();
        girl.chatting();
    }
}
