package org.jaylan.beanlife;

/**
 * Bean生命周期
 */
public class BeanLife {
    private  String name;


    public BeanLife() {
    }


    public  void initBean(){
        System.out.println("   执行了initBean方法");
    }

//

    public  void destroyBean(){
        System.out.println(" 3 执行了destroyBean方法");
    }


}
