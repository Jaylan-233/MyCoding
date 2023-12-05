package com.mybatis;

import com.itheima.mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname MybatisTest
 * @Description
 * @Author Jaylan
 * @Date 2023/12/5 22:35
 * @Version 1.0.0
 */
public class MybatisTest {

    //    1.获取配置文件名称
    String recourse = "mybatis-config.xml";

    //   2.输入读取信息
    InputStream inputStream = Resources.getResourceAsStream(recourse);

    //   3.根据读取到的信息创建 sqlSession工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //   4.使用工厂对象 创建sqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    @Test
    public void selectAll() {
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        System.out.println(brandMapper.selectAll());
        // 回收资源
        sqlSession.close();
    }

    public MybatisTest() throws IOException {
    }


}
