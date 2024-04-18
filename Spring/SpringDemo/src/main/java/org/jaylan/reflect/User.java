package org.jaylan.reflect;

/**
 * 反射Demo
 */

public class User {
    private String name;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void go(){
        System.out.println("调用了无参构造方法");
    }
    public void go1(String name,String size){
        this.name=name;
        this.size=size;
        System.out.println("调用了有参构造方法");
        System.out.println("name="+name);
        System.out.println("size="+size);
    }

}
