package com.jaylan.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Classname demo
 * @Description Filter拦截器示例 使用web.xml进行配置
 * @Author Jaylan
 * @Date 2023/11/20 11:05
 * @Version 1.0.0
 */
//这里是拦截器
public class Demo01 implements Filter {
//
    /*
     * 因为是接口所以重写三个方法
     * init()初始化用的
     * doFilter()执行拦截用的 核心
     * destroy()销毁方法
     * */

    //    不重写也行 有默认的重写
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        1.执行拦截
        System.out.println("拦截器生效!,使用web.xml配置");
//        2.执行放行 -带着请求和响应
        filterChain.doFilter(servletRequest, servletResponse);
    }


    //   不重写也行 有默认的重写
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
