package me.harshu;

import me.harshu.bean.MyConnection;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

//        Context Invocation
        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);
    }
}