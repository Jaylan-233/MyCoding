package com.jaylan.listener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class TestListener03 implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent event)  { 
         System.out.println("HttpSession对象被创建了");
    }
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	 System.out.println("HttpSession对象被销毁了");
    }
}
