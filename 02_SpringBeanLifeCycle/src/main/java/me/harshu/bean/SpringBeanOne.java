package me.harshu.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne Object Created");
    }
}
