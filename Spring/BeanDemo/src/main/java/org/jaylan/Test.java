package org.jaylan;

import org.jaylan.relative.Clazz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//     加载 应用环境配置文件
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
//     获取一个bean(通过bean的id）
        Clazz clazz = (Clazz)app.getBean("clazz");
//     输出包含对象的
        System.out.println(clazz.getClazzName());
//     获取clazz关联对象（student）的name
        System.out.println(clazz.getStudent().getName());
    }
}
