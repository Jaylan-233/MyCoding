package com.test;

import com.dto.UserDto;

public class UserTest {
    public static void main(String[] args) {
        //判断用户名是否存在
//        System.out.println(UserDto.isExist("admin"));
//        新增用户
        System.out.println(UserDto.addUser("huaji1","huaji233"));
    }
}
