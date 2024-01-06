package com.jaylan.listener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
public class TestListener02 implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent event)  { 
         //获取ServletContext对象中添加的属性名称
    	 String name = event.getName();
         //获取ServletContext对象
         ServletContext servletContext = event.getServletContext();
         //输出信息
         servletContext.log("添加属性"+name);
    }
    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    	 String name = event.getName();
         ServletContext servletContext = event.getServletContext();
         servletContext.log("修改属性"+name);
    }
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    	 String name = event.getName();
         ServletContext servletContext = event.getServletContext();
         servletContext.log("删除属性"+name);
    }
}