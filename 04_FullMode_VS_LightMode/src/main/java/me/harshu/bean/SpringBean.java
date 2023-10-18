package me.harshu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("SpringBean Object Created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean Factory Bean Aware ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean Bean Name Aware ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean Disposable Bean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean Initializing Bean ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean Application Context Aware ");
    }

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
