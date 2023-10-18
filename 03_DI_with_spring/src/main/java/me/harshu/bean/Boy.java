package me.harshu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Qualifier("girlOne")
    @Autowired
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Object Created");
    }

    public void chattingWithGirl() {
        girl.chatting();
    }
}
