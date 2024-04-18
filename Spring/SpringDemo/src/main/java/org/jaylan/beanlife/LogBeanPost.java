package org.jaylan.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 七步 Bean生命周期
 * 多了的两部是在Bean之前的
 */
public class LogBeanPost implements BeanPostProcessor {

//    这里不涉及User类 为什么会调用到User中的东西？
//    因为作用域的原因 默认为single 会帮忙实例化所有的Bean
//
    /**
     *
     * @param o 实例化的对象？ 如果有多个呢?
     * @param s
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        System.out.println("before"+o);
        return o;
    }

    /**
     *
     * @param o
     * @param s
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        return o;
    }
}
