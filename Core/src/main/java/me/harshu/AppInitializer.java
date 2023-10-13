package me.harshu;

import me.harshu.bean.MyConnection;
import me.harshu.bean.SpringBean;
import me.harshu.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

//        by this method we can run anything before shutdown the JVM(Manual Method)==============
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to Shutdown");
//            }
//        }));

//        Creating Bean Factory (AnnotationConfigApplicationContext Object)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

//        Introducing AnnotationConfigApplicationContext class to ApplicationContext
        context.register(AppConfig.class);

//     by this method we can run anything before shutdown the JVM(Introduced by Spring)
        context.registerShutdownHook();

//        Refreshing AnnotationConfigApplicationContext Object
        context.refresh();

//        Check whether SpringBean is working
//        SpringBean -> springBean(Bean ID)
        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

//        by this method we can add a class to ApplicationContext that not belongs to us(EX:-DBConnection Class)
        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);

//        Closing the ApplicationContext
        context.close();
    }
}