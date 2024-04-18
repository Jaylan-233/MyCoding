package org.jaylan;

import java.lang.reflect.Proxy;

/**
 * 动态代理 (Java的动态代理机制)
 *
 */
public class Test {
    public static void main(String[] args) {
        // 将创建的对象交给接口 进行代理
        //1 创建代理对象 target
        // 调用target(代理对象)时 ->会将要执行的方法交给 被代理的类
        // 代理持有对象代理对象的引用 (这里对代理对象的引用就是接口)  这里 target 是代理人 持有了对被代理对象(User的引用)

        UserInterface target=new User();
        // ** 获取对被代理对象的引用( 接口)
        /**
         * 接口定义了 能做些什么 User 的接口 说明了 对User所能进行的操作 (只是说明 并没有实现)
         */
        /*
         * 将对象交给接口是为了创建一个实现了相同接口的代理对象。这样，你就可以在不修改原有对象代码的情况下，控制对对象方法的调用
         */
        // 参数??
        //8 参数1 内代理类的类加载器
        // 参数2 被代理的类
        // 参数3 ??
        // ** 创建代理实例(代理 需要在拿到了被代理类的引用后 也要进行实例化)
        UserInterface proxy= (UserInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //获取被代理的类 (使用反射机制 获取被代理类中的内容)
                target.getClass().getInterfaces(), // 获取被代理类的接口( 知道这个类 应该实现哪些方法 调用时取这里找对应的方法)
                // Q: 如果类没有接口还能不能进行代理?
                new ZtimeInvocationHandle(target));
        /* *
         * 创建一个调用处理器实例，它将拦截对代理对象的调用，并将这些调用转发给目标对象（target）。
         * ZtimeInvocationHandle是一个自定义的调用处理器，它可能包含了一些额外的逻辑，
         * 比如延迟处理（Ztime可能是一个代表时间延迟的逻辑）。
         */
        // 通过代理调用对象的方法
        proxy.addUser();
    }
}
