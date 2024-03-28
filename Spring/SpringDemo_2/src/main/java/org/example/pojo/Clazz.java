package org.example.pojo;

public class Clazz {
    private String name;
    private int age;
    private Clazz clazz;


    public Clazz() {
    }

    public Clazz(String name, int age, Clazz clazz) {
        this.name = name;
        this.age = age;
        this.clazz = clazz;
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

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
