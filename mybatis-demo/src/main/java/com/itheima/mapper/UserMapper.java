package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description UserMapper接口
 * @Author Jaylan
 * @Date 2023/12/3 12:52
 * @Version 1.0.0
 */
public interface UserMapper {
    //这里的方法名要和SQL的id一样


    @Select("select * from tb_user")
    List<User> selectAll();

    User selectById(String id);
}
