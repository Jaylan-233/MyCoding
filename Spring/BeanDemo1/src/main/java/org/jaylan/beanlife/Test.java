package org.jaylan.beanlife;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("app8.xml");
        BeanLife beanLife= (BeanLife) applicationContext.getBean("beanLife");

//        向下转型 才能执行close方法 找父类或者子类
//        TODO:怎么变成子类？？ 强制转型
        ClassPathXmlApplicationContext context= (ClassPathXmlApplicationContext)applicationContext;
        context.close();

//        使用7个 生命周期版本 得实例化的时候才会用



    }
}
