package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne Object Created");
    }
}
