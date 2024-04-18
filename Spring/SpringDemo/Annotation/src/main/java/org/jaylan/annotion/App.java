package org.jaylan.annotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//       通过扫包的东西来 创建容器对象
//        参数是扫描包的那个类
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        User user=(User)applicationContext.getBean("user");
        System.out.println(user);

    }
}
