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
}
