package me.harshu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
//    public SpringBean() {
//        System.out.println("Default Constructor");
//    }

    @Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("10") int age, @Value("true") boolean b) {
        System.out.println("Spring Bean Object Created");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }


    @Autowired(required = false)
    public SpringBean(@Value("Hansika,Sewwandi,Harshana") String[] myNames) {
        System.out.println("Spring Bean Object Created");
        for (String myName : myNames) {
            System.out.println(myName);
        }
    }
}
