package me.harshu.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements InitializingBean {
    @Value("C001")
    private String id;
    @Value("Harshana")
    private String name;
    @Value("Mahiyanganaya")
    private String address;
    @Value("15000000.00")
    private double salary;

    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo Bean Object Created");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("============================================================");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
