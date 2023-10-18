package me.harshu;

import me.harshu.bean.Boy;
import me.harshu.bean.GirlOne;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();
//        Boy boy = context.getBean(Boy.class);
//        GirlOne girlOne = context.getBean(GirlOne.class);
//        System.out.println(boy);
//        System.out.println(girlOne);
//        boy.chattingWithGirl();
//        John bean = context.getBean(John.class);
//        bean.chattingWithMerlin();
    }
}