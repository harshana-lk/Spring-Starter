package me.harshu.config;

import me.harshu.bean.MyBasicDataSource;
import me.harshu.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "me.harshu.bean")
public class AppConfig {

    @Bean
    public MyBasicDataSource basicDataSource(){
//        MyConnection myConnection = new MyConnection();
//        Inter Bean Dependency Invocation
        MyConnection myConnection1 = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();
        System.out.println(myConnection1);
        System.out.println(myConnection2);
        System.out.println(myConnection3);
        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setConnection(myConnection1);
        return myBasicDataSource;
    }

    @Bean
    public MyConnection myConnection(){
        return new MyConnection();
    }
}
