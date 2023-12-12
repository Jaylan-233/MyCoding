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

    //1.获取配置文件名称
    String resources = "mybatis-config.xml";
    //   2.使用输入流读入内容  注意这里是=Resources 从resource 读取配置文件专用的类 参数是文件名字
    InputStream inputStream = Resources.getResourceAsStream(resources);

    //   3.使用读入的内容创建SqlSessionFactory对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //4.使用sqlSession工厂创建sqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //    创建Mapper代理对象sqlSession.getMapper方法 参数是Mapper类
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

    @Test
    public void selectAll() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);

    }


}
