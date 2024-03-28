package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserInterface;
import org.example.dao.UserVIpDao;


public class UserService {
    private UserInterface userDao;
    private UserInterface userVIpDao;


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public  void saveUser()
    {
        System.out.println("调用了saveUser");
    }
}
