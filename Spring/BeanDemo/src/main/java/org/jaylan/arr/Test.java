package org.jaylan.arr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationCo");
        System.out.println(applicationContext.getBean("str"));
    }

}
