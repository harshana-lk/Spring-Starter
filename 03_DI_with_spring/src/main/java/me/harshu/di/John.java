package me.harshu.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class John {
    @Autowired
    SuperMerlin merlin;
    public John() {
        System.out.println("John Object Created");
    }

    public void chattingWithMerlin(){
        merlin.chatting();
    }
}
