package me.harshu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    MyConnection connection;

    public MyBasicDataSource() {
        System.out.println("MyBasicDataSource Bean Object Created");
    }

    public void setConnection(MyConnection connection){
        this.connection=connection;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyBasicDataSource Factory Bean Aware ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyBasicDataSource Bean Name Aware ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyBasicDataSource Disposable Bean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBasicDataSource Initializing Bean ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyBasicDataSource Application Context Aware ");
    }
}
