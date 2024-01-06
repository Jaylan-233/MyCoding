package com.jaylan.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestFilter04 implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    //?? 功能是什么?
		HttpServletRequest  req  =  (HttpServletRequest) request;
	    HttpServletResponse res  =  (HttpServletResponse) response;
	    //获取请求头中refer字段的值ֵreferer的作用?
	    String referer = req.getHeader("referer");
		System.out.println("所使用的浏览referer字段="+referer);
		//如何在请求头中设置这个referer
	    //如果是浏览器直接发来的请求或其他网站转发的请求，则转发到error.jpg
	    if (referer==null||!referer.contains(request.getServerName())) {
			System.out.println("服务器名称="+request.getServerName());
			//直接发来的请求 referer是空的
			//或者不包含服务器名称?
			//进行请求转发到error.jpg
			RequestDispatcher dispatcher = req.getRequestDispatcher("/pic/error.jpg");
			dispatcher.forward(req, res);
		} else {
			chain.doFilter(request,response);
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}
