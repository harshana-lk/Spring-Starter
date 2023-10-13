package me.harshu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Object Created");
    }
}
