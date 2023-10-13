package me.harshu.config;

import me.harshu.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Object Created");
    }

    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }
}
