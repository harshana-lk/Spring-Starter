package me.harshu.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class GirlOne implements GoodGirl{
    public GirlOne() {
        System.out.println("Girl One Object Created");
    }

    @Override
    public void chatting() {
        System.out.println("Girl One Chatting Started");
    }
}
