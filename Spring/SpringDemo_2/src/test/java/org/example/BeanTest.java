package org.example;

import org.example.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person =(Person) app.getBean("person");

        System.out.println(person.getClazz().getAge());
//        System.out.println("姓名="+person.getName());
//        System.out.println("年龄="+person.getAge());

    }
}
