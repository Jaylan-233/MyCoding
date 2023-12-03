package com.itheima;


import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class MyBatisDemo {

    public static void main(String[] args) throws IOException {

        //1. 加载mybatis的核心配置文件mybatis-config.xml，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        //1.1读取配置文件信息并
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //1.2根据配置文件创建  sqlSessionFactory 对象 只创建一次
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2. 通过 sqlSessionFactory 对象 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //使用代理
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.selectAll());
        //4. 执行完成了之后记得释放资源释放资源
        sqlSession.close();

    }
}
