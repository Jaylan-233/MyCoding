package com.jaylan.listener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
public class TestListener07 implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent event)  { 
    	System.out.println("ServletRequest对象被销毁了");
    }
    public void requestInitialized(ServletRequestEvent event)  { 
         System.out.println("ServletRequest对象被创建了");
    }
	
}
