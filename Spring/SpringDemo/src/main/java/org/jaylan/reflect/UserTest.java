package org.jaylan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UserTest {
    /**
     * 测试 反射
     */
    public static void main(String[] args) {
        try {
//                获取User类 加载类
            Class<?> userClass = Class.forName("org.jaylan.reflect.User");
//            实例化
            Object userObject=userClass.newInstance();
//                获取所有字段名 返回值为数组类型
            Field[] declaredFields = userClass.getDeclaredFields();
            System.out.println("获取到的属性名称----");
            for (Field declareFiled : declaredFields) {
                System.out.println(declareFiled.getName());
//                    declareFiled.getName() 只打印属性名称
//                    declareFiled 完整的字段名称
            }
            System.out.println("获取所有方法-----");
//                获取所有的方法
            Method[] userClassMethods = userClass.getDeclaredMethods();
            for (Method method : userClassMethods) {
                System.out.println(method.getName());
            }

//          通过反射调用方法 需要先将类进行实例化
            System.out.println("通过反射调用方法---");
            for (Method method : userClassMethods) {
                if(method.getName()=="go")
                {
//                    ??
                    method.invoke(userObject);

                }
                if(method.getName()=="go1")
                {
//                    传递实例化的对象和参数
                    method.invoke(userObject,"AA","BB");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
