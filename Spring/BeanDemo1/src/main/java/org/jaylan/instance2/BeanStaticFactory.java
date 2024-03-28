package org.jaylan.instance2;

/**
 * 静态工厂实例化
 */
public class BeanStaticFactory {
    private static final BeanClass beanInstance = new BeanClass();


    /**
     * @apiNote 创建一个bean实例  本来是自己调用的这里 交给Spring框架调用
     * @return bean实例
     */
    public static BeanClass createInstance() {

        return beanInstance;
    }


}
