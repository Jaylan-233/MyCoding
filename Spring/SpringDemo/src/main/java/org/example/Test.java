package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        默认的读取路径是resource 目录
//        读取配置文件创建 容器
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

//        获取容器中的bean 参数是bean的id 自动推算返回类型Ctrl +Alt + V
//        获取容器中的其中一个Bean
        Person person = (Person)app.getBean("person");
        System.out.println(person.getAge());
    }
}
