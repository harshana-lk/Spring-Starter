package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class GirlTwo implements GoodGirl {
    public GirlTwo() {
        System.out.println("Girl Object Created");
    }

    @Override
    public void chatting() {
        System.out.println("Girl Two Chatting Started");
    }
}
