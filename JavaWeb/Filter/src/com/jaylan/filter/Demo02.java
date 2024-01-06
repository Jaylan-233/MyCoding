package com.jaylan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Classname demo2
 * @Description 拦截器示例使用 注解的方式进行配置
 * @Author Jaylan
 * @Date 2023/11/20 11:25
 * @Version 1.0.0
 */
@WebFilter(
        urlPatterns = "/jsp/demo02.jsp", //要拦截的页面
        dispatcherTypes = DispatcherType.REQUEST //Filter类型 即在什么样的请求下生效
)
//这里的参数和web.xml中配置的类似
public class Demo02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        1.拦截
        System.out.println("拦截器Demo02生效 使用是注解的写法");
//        2.放行
        System.out.println("执行放行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
