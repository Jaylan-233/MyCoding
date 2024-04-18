package org.jaylan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ComponentScans.class);
        User user = (User) applicationContext.getBean("user");
        user.go();


    }
}
