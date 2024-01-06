package com.jaylan.listener;
import java.io.Serializable;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
public class TestListener06 implements HttpSessionActivationListener,Serializable {
    private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public void sessionDidActivate(HttpSessionEvent event)  { 
		System.out.println("TestListener06的对象被活化了");
    }
    public void sessionWillPassivate(HttpSessionEvent event)  { 
    	System.out.println("TestListener06的对象被钝化了");
    }
}
