package me.harshu.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {
    @Value("${os.name}")
    private String osName;
    @Value("${user.name}")
    private String userName;
    @Value("${ijse.application.name}")
    private String projectName;
    @Value("${my.name}")
    private String myName;
    public SpringBeanOne() {
        System.out.println("SpringBeanOne Object Created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OS Name : "+osName);
        System.out.println("User Name : "+userName);
        System.out.println("Application Name : "+projectName);
    }
}
