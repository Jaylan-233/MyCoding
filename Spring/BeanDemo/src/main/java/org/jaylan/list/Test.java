package org.jaylan.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//     加载 应用环境配置文件
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
//     获取一个bean(通过bean的id）
        Object vipList = app.getBean("vip");
        System.out.println(vipList);
    }
}
