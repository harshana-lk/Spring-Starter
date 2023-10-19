package me.harshu;

import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

//        How to get System Environment Variables
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key + " : " + getenv.get(key));
        }

//        How to get Predefined Properties from Java
        System.out.println("==================================================================");
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key+" : "+properties.get(key));
        }
    }
}