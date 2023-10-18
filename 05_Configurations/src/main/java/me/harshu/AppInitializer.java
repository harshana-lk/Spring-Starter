package me.harshu;

import me.harshu.config.AppConfig;
import me.harshu.config.AppConfig1;
import me.harshu.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class, AppConfig1.class, AppConfig2.class);
        context.refresh();
        context.registerShutdownHook();
    }
}