package com.mybatis;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Classname UserTest
 * @Description
 * @Author Jaylan
 * @Date 2023/12/12 20:10
 * @Version 1.0.0
 */
public class UserTest {
    public UserTest() throws IOException {
    }

    //    1.获取配置文件名称
    String resources = "mybatis-config.xml";
    //    2.读取配置文件 从项目的recourse目录下进行读取
    InputStream inputStream = Resources.getResourceAsStream(resources);
    //    3.通过SqlSessionFactoryBuilder的build方法使用配置文件创建sqlSession工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //    使用代理开发创建对象时需要使用getMapper方法创建Mapper对象 不能直接new
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    @Test
    public void selectAll() {

        List<User> userList = userMapper.selectAll();
        System.out.println(userList);

    }


}
