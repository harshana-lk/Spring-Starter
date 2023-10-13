package me.harshu;

import me.harshu.bean.SpringBean;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

//        Creating Bean Factory (AnnotationConfigApplicationContext Object)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        Introducing AnnotationConfigApplicationContext class to ApplicationContext
        context.register(AppConfig.class);

//        Refreshing AnnotationConfigApplicationContext Object
        context.refresh();

//        Check whether SpringBean is working
        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();


        context.close();
    }
}