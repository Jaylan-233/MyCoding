package org.jaylan.bean;

/**
 * 工厂类(静态工厂） 多态 复用
 * 关联素有实例
 * 用来创建对象用的
 */
public class Factory {
    public static Weapon getWeapon(String type) {
        Weapon weapon = null;
//        判断要啥类型 以及是否有错误
        if (type.equals("Tank")) {
            weapon = new Tank();
        }
        if (type.equals("Flight")) {
            weapon = new Flight();
        }

        return weapon;
    }


}
