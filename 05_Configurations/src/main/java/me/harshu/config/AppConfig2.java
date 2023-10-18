package me.harshu.config;

import me.harshu.bean.C;
import me.harshu.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public C c(){
        return new C();
    }

    @Bean
    public D d(){
        return new D();
    }
}
