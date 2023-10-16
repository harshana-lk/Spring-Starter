package me.harshu.config;

import me.harshu.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public MyConnection getMyConnection(){
        return new MyConnection();
    }
}
