package org.example.dao;

public class UserDao implements  UserInterface{

    @Override
    public void save() {
        System.out.println("save Done User");
    }
}
