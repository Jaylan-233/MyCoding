package org.jaylan.bean;

/**
 * Weapon的子类
 */
public class Flight extends Weapon{
    @Override
    public void fight() {
        System.out.println("Flight执行了 fight方法");
    }
}
