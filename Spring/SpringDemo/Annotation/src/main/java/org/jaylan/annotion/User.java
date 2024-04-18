package org.jaylan.annotion;


import org.springframework.stereotype.Service;

// bean id 类名首字母小写 user
// TODO 为什么这里 要使用

//@Servic ()这里面 可以指定规则 value=xxx xxx是bean id
// 写了
// 不些参数的话 bean id 就是类名称(小写形式)
@Service
public class User {
    private  String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
