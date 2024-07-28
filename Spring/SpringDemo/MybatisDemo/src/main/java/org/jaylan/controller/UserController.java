package org.jaylan.controller;
import java.util.ArrayList;
import java.util.List;

import org.jaylan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Autowired
	private UserDao userDao;
	public void test() {
		/**
		//?????????
		MyUser auser = userDao.selectUserById(1);
		System.out.println(auser);
		System.out.println("================");
		//?????????
		MyUser addmu = new MyUser();
		addmu.setUname("???");
		addmu.setUsex("??");
		int add = userDao.addUser(addmu);
		System.out.println("?????" + add + "?????");
		System.out.println("================");
		//?????????
		MyUser updatemu = new MyUser();
		updatemu.setUid(1);
		updatemu.setUname("????");
		updatemu.setUsex("?");
		int up = userDao.updateUser(updatemu);
		System.out.println("?????" + up + "?????");
		System.out.println( "================");
		//?????????
		int dl = userDao.deleteUser(9);
		System.out.println("?????" + dl + "?????");
		System.out.println("================");
		//??????????
		List<MyUser> list = userDao.selectAllUser();
		for (MyUser myUser : list) {
			System.out.println(myUser);
		}**/
		//???if???????????
		MyUser ifmu = new MyUser();
		ifmu.setUname("??");
		ifmu.setUsex("?");
		List<MyUser> listByif = userDao.selectUserByIf(ifmu);
		System.out.println("if???================");
		for (MyUser myUser : listByif) {
			System.out.println(myUser);
		}
		//???choose???????????
		MyUser choosemu = new MyUser();
		choosemu.setUname("");
		choosemu.setUsex("");
		List<MyUser> listByChoose = userDao.selectUserByChoose(choosemu);
		System.out.println("choose???================");
		for (MyUser myUser : listByChoose) {
			System.out.println(myUser);
		}
		//???trim???????????
		MyUser trimmu = new MyUser();
		trimmu.setUname("??");
		trimmu.setUsex("??");
		List<MyUser> listByTrim = userDao.selectUserByTrim(trimmu);
		System.out.println("trim???================");
		for (MyUser myUser : listByTrim) {
			System.out.println(myUser);
		}
		//???where???????????
		MyUser wheremu = new MyUser();
		wheremu.setUname("??");
		wheremu.setUsex("??");
		List<MyUser> listByWhere = userDao.selectUserByWhere(wheremu);
		System.out.println("where???================");
		for (MyUser myUser : listByWhere) {
			System.out.println(myUser);
		}
		//???set????????????
		MyUser setmu = new MyUser();
		setmu.setUid(1);
		setmu.setUname("???");
		int setup = userDao.updateUserBySet(setmu);
		System.out.println("set????????" + setup + "?????");
		System.out.println( "================");
		//???foreach?????????????
		List<Integer> listId = new ArrayList<Integer>();
		listId.add(34);
		listId.add(37);
		List<MyUser> listByForeach = userDao.selectUserByForeach(listId);
		System.out.println("foreach???================");
		for (MyUser myUser : listByForeach) {
			System.out.println(myUser);
		}
		//???bind???????????
		MyUser bindmu = new MyUser();
		bindmu.setUname("??");
		List<MyUser> listByBind = userDao.selectUserByBind(bindmu);
		System.out.println("bind???================");
		for (MyUser myUser : listByBind) {
			System.out.println(myUser);
		}
	}
}
