package org.jaylan.beanlife;

public class User {
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Bean赋值阶段-给name赋值");
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        System.out.println("Bean赋值阶段-给size赋值");
        this.size = size;
    }

    public User() {
        System.out.println("调用构造方法实例化Bean");
    }

    public void init(){
        System.out.println("Bean初始化阶段-调用了自定义的初始化方法");
    }
    public void destroy()
    {
        System.out.println("Bean销毁阶段-调用了自定义的销毁方法");
    }
    public void sayHello()
    {
        System.out.println("Bean使用阶段");
    }
}
