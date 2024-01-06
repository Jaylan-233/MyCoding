package com.jaylan.filter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class TestFilter02 implements Filter {
	public void destroy() {
	}	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.print("TestFilter02  before ");
		out.print("<br>");
		//将请求发给下一个Filter或Web资源
		chain.doFilter(request, response);
		out.print("TestFilter02 after");
		out.print("<br>");
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}
