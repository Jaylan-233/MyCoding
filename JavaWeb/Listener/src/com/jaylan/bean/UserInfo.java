package com.jaylan.bean;
import java.util.HashMap;
import java.util.Map;

import com.jaylan.listener.TestListener09;
public class UserInfo {
	private UserInfo(){}
	private Map userMap = new HashMap<>();
	private static UserInfo instance =new UserInfo();
	public  static UserInfo getInstance(){
		return instance;
	}
	public void addBean(TestListener09 bean){
		userMap.put(bean.getId(), bean.getUsername());
	}
	public void removeBean(TestListener09 bean){
		userMap.remove(bean.getId());
	}
	public Map getBeanMap(){
		return userMap;
	}
}
