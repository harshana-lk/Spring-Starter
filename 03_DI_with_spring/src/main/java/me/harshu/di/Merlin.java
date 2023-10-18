package me.harshu.di;

import org.springframework.stereotype.Component;

@Component
public class Merlin implements SuperMerlin {
    public Merlin() {
        System.out.println("Merlin Object Created");
    }

    @Override
    public void chatting(){
        System.out.println("Chatting Started with John");
    }
}
