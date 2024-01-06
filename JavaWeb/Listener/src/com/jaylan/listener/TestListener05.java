package com.jaylan.listener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
public class TestListener05 implements HttpSessionBindingListener {
    public void valueUnbound(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	System.out.println(name+"对象从HttpSession对象解绑");
    }
    public void valueBound(HttpSessionBindingEvent event)  { 
    	String name = event.getName();
    	System.out.println(name+"对象被绑定到HttpSession对象");
    }
}
