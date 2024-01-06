package com.jaylan.listener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
public class TestListener08 implements ServletRequestAttributeListener { 
    public void attributeAdded(ServletRequestAttributeEvent event)  { 
    	String name = event.getName();
    	System.out.println("ServletRequest对象添加"+name+"属性");
    }
    public void attributeRemoved(ServletRequestAttributeEvent event)  { 
    	String name = event.getName();
    	System.out.println("ServletRequest对象删除"+name+"属性");
    }
    public void attributeReplaced(ServletRequestAttributeEvent event)  { 
    	String name = event.getName();
    	System.out.println("ServletRequest对象修改"+name+"属性");
    }
}
