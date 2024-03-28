package org.jaylan.instance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanClassTest {

    //构造方法实例化
    @Test
    public void test()
    {
        ApplicationContext app= new ClassPathXmlApplicationContext("app1.xml");
        BeanClass beanClass= (BeanClass) app.getBean("beanClass");
        System.out.println(beanClass);
    }


}
