package me.harshu.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GirlOne implements GoodGirl{
    public GirlOne() {
        System.out.println("Girl Object Created");
    }

    @Override
    public void chatting() {
        System.out.println("Girl One Chatting Started");
    }
}
