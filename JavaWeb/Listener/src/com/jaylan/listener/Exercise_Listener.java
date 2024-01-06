package com.jaylan.listener;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class Exercise_Listener implements ServletRequestListener {
	private Integer count = 0;
    public void requestInitialized(ServletRequestEvent event)  { 
    	 count++;
    	 ServletContext servletContext = event.getServletContext();
         servletContext.setAttribute("count", count);
         HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
    }
    public void requestDestroyed(ServletRequestEvent event)  { 
    }
}
