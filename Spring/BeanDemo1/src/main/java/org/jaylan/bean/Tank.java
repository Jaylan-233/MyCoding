package org.jaylan.bean;


public class Tank extends Weapon {
    @Override
    public void fight() {
        System.out.println("Flight执行了 fight方法");
    }
}
