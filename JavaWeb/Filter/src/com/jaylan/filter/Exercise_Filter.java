package com.jaylan.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Exercise_Filter implements Filter {
	public void destroy() {	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		String  username= (String) req.getSession().getAttribute("username");
		if(null==username){
			//如果用户没有登录,重新定向到登录页面
			res.sendRedirect(req.getContextPath()+"/exercise_login.html");
		}else{
			//如果用户登录,放行
			chain.doFilter(request, response);
		}
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {	
	}
}
