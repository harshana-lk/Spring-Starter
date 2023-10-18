package me.harshu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
@Import({AppConfig1.class, AppConfig2.class}) //we can import configurations into a single class
public class AppConfig {
}
