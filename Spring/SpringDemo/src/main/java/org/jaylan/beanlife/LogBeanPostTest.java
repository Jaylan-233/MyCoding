package org.jaylan.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogBeanPostTest {
    public static void main(String[] args) {

        ApplicationContext app=new ClassPathXmlApplicationContext("\\beanlife\\applicationContext.xml");

//        获取Bean实例
//        LogBeanPost logBeanPost=(LogBeanPost)app.getBean("log");



    }
}
