package org.jaylan;


public class User {
    private  String name;
    private  String size;

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
    public  void go()
    {
        System.out.println("调用Bean方法");
    }
}
