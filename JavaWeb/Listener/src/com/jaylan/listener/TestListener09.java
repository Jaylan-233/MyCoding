package com.jaylan.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import com.jaylan.bean.UserInfo;

public class TestListener09 implements HttpSessionBindingListener {
	private String id;
	private String username;
	private String password;
	public  String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void valueUnbound(HttpSessionBindingEvent arg0)  { 
		UserInfo.getInstance().removeBean(this);
    }
    public void valueBound(HttpSessionBindingEvent arg0)  { 
    	UserInfo.getInstance().addBean(this);
    }
	
}
