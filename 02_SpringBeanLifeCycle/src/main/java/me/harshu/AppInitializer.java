package me.harshu;

import me.harshu.bean.SpringBeanOne;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

        SpringBeanOne bean1 = context.getBean(SpringBeanOne.class);
        SpringBeanOne bean2 = context.getBean(SpringBeanOne.class);
        SpringBeanOne bean3 = context.getBean(SpringBeanOne.class);

        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);
    }
}