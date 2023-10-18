package me.harshu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Object Created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo Bean Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanTwo Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo Bean Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo Bean Initializing Bean Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo Bean Application Context Aware");
    }
}
