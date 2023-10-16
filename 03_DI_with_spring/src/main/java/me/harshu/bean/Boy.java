package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
//    Girl girl = new Girl(); // Property Injection

    Girl girl;

//    Constructor Injection
//    public Boy(Girl girl) {
//        this.girl = girl;
//    }

//    Setter Method Injection
    public void setGirl(Girl girl){
        this.girl=girl;
    }

    public void chattingWithGirl() {
        girl.chatting();
    }
}
