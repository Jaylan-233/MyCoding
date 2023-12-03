package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description UserMapper接口
 * @Author Jaylan
 * @Date 2023/12/3 12:52
 * @Version 1.0.0
 */
public interface UserMapper {
    //这里的方法名车要和SQL的id一样
    List<User> selectAll();
}
