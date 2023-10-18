package me.harshu.config;

import me.harshu.bean.SpringBeanOne;
import me.harshu.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(){
//        Inter Bean Dependency
        SpringBeanTwo bean = getBeanTwo();
        SpringBeanTwo beanTwo = getBeanTwo();
        System.out.println(bean);
        System.out.println(beanTwo);


        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }
}
