package org.jaylan.instance3;

/**
 * 实例工厂实例化
 * 名字里面没说是静态的
 */
public class BeanInstanceFactory {
    /**
     * @apiNote
     * @return
     */
    public BeanClass  createBeanClassInstance(){
        return new BeanClass();
    }
}
