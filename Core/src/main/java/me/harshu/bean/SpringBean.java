package me.harshu.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Object Created");
    }

    public void testBean(){
        System.out.println("Spring Bean is working!");
    }
}
