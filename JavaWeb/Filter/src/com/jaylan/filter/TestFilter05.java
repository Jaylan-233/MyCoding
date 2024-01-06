package com.jaylan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/*使用Filter进行铭感词过滤*/
public class TestFilter05 implements Filter {

    //初始化用的
    public void init(FilterConfig fConfig) {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //为什么要这俩创建俩新的对象?
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        //		设置编码方式
        req.setCharacterEncoding("utf-8");
//        链式拦截器 执行完成之后再接着执行自定义的拦截器  创建一个自定义拦截对象并使用
//        因为是拦截器只要把请求作为参数就行 req
        chain.doFilter(new MyRequest(req), res);
    }

    //    销毁用的
    public void destroy() {
    }
}

//TODO:HttpServletRequestWrapper 是什么? 作用?
class MyRequest extends HttpServletRequestWrapper {
    private final HttpServletRequest request;

    public MyRequest(HttpServletRequest request) {
        super(request);
        //继承父类方法
        this.request = request;
    }

    @Override
    public String getParameter(String name) {
        //TODO:info从哪里来的?
//        获取名称为name的参数
        //如果 把info和name进行比较
        if ("info".equals(name)) {
            String info = request.getParameter("info");
            //设置敏感词
            String[] str = {"SB", "fuck", "水货"};
            //将页面提交信息中的敏感词替换为“**”
            for (String s : str) {
                info = info.replace(s, "**");
            }
            return info;
        }
        return request.getParameter(name);
    }
}