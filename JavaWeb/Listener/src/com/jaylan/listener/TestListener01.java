package com.jaylan.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class TestListener01 implements ServletContextListener {
    public void contextInitialized(ServletContextEvent arg0)  { 
    	//System.out.println("ServletContext对象被创建了");

    }
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	//System.out.println("ServletContext对象被销毁了");
    }
}
