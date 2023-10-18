package me.harshu.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GirlTwo implements GoodGirl {
    public GirlTwo() {
        System.out.println("Girl Object Created");
    }

    @Override
    public void chatting() {
        System.out.println("Girl Two Chatting Started");
    }
}
