package org.example;

import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public  void test()
    {
        ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");

       UserService userService=(UserService) app.getBean("userService");
       userService.saveUser();


    }

}
