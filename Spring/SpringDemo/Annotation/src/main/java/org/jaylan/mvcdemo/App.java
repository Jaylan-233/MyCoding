package org.jaylan.mvcdemo;

import org.jaylan.mvcdemo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext 通过配置类读取配置文件(扫描到的)
        ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
        UserService service=(UserService) app.getBean("userService");
        service.saveService();

    }
}
