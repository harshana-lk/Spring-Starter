package me.harshu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Girl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Girl() {
        System.out.println("Girl Object Created");
    }

    public void chatting() {
        System.out.println("Chatting Started");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl Bean Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl Bean Destroy Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl Bean Application Context Aware");
    }
}
