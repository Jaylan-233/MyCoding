package org.jaylan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler 反射中的一部分
 */
public class ZtimeInvocationHandle implements InvocationHandler {

    private Object o;

    // 构造方法 作用?
    public ZtimeInvocationHandle(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(o);
        System.out.println("开始调用");
        // 通过反射创建对象?
        Object invoke=method.invoke(o,args);
        System.out.println("结束调用");
        return null;

    }
}
