package org.jaylan.beanlife;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Bean生命周期 5个
 */
public class TestUser {
    public static void main(String[] args) {

        ApplicationContext app=new ClassPathXmlApplicationContext("\\beanlife\\applicationContext.xml");

        ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)app;

        User user=(User)app.getBean("user");


//         使用Bean Bean使用阶段
        user.sayHello();
//        手动调用 调用销毁方法
         ctx.close();
//            关闭的接口 只有ClassPathXmlPath才有

    }
}
