package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class NewBean {
    public NewBean() {
        System.out.println("New Bean Object created");
    }
}
