package org.example.pojo;

public class Person {
    private String name;
    private int age;
    private Clazz clazz;

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    //    无参构造
    public Person(){};
//    有参数构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAge_1(int age) {
        this.age = age;
    }
    public void setAge_2(int age) {
        this.age = age;
    }
    public void setAge_3(int age) {
        this.age = age;
    }
}
