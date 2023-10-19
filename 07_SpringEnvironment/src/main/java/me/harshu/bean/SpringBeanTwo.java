package me.harshu.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements InitializingBean {
    @Value("${my.name}")
    private String myName;
    @Value("${my.age}")
    private String myAge;
    @Value("${my.city}")
    private String myCity;

    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo Object Created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My Name : "+myName);
        System.out.println("My Age : "+myAge);
        System.out.println("My City : "+myCity);
    }
}
