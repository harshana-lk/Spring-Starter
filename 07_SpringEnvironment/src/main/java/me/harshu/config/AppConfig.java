package me.harshu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
