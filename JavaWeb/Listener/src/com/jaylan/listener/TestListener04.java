package com.jaylan.listener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
public class TestListener04 implements HttpSessionAttributeListener {
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	System.out.println("HttpSession对象删除"+name+"属性");
    }
    public void attributeAdded(HttpSessionBindingEvent event)  {
    	String name = event.getName();
    	System.out.println("HttpSession对象添加"+name+"属性");
    }
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	System.out.println("HttpSession对象修改"+name+"属性");
    }
}
