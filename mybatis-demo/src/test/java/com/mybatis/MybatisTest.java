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

    // 1.获取配置文件名称
    String resource = "mybatis-config.xml";
    // 根据配置文件名字读取配置文件 放入入流中
    InputStream inputStream = Resources.getResourceAsStream(resource);

    //使用输入流读入的信息建sqlSessionFactory对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 通过seqSessionFactory对象的openSession方法 获取sqlSession对象
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
