package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Girl() {
        System.out.println("Girl Object Created");
    }

    public void chatting() {
        System.out.println("Chatting Started");
    }
}
