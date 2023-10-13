package me.harshu;

import me.harshu.bean.SpringBean;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

//        by this method we can run anything before shutdown the JVM
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to Shutdown");
            }
        }));

//        Creating Bean Factory (AnnotationConfigApplicationContext Object)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        Introducing AnnotationConfigApplicationContext class to ApplicationContext
        context.register(AppConfig.class);

//        Refreshing AnnotationConfigApplicationContext Object
        context.refresh();

//        Check whether SpringBean is working
        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

//        Closing the ApplicationContext
        context.close();
    }
}