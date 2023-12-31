package com.mybatis;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname BrandTest
 * @Description
 * @Author Jaylan
 * @Date 2023/12/12 17:42
 * @Version 1.0.0
 */
public class BrandTest {

    //    1.获取配置文件名称
    String recourse = "mybatis-config.xml";

    //   2.输入读取信息
    InputStream inputStream = Resources.getResourceAsStream(recourse);

    //   3.根据读取到的信息创建 sqlSession工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //   4.使用工厂对象 创建sqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

    public BrandTest() throws IOException {
    }

    @Test
    public void selectByCondition() {
        String companyName = "华为";
        String brandName = "华为";
//        对字符串进行拼接 进行模糊查询
        Brand brand = new Brand();

        brand.setStatus(1);
        brand.setCompanyName("华为");
        brand.setBrandName("华为");

//        使用Map封装参数
        Map<String,String> map=new HashMap<>();
        map.put("status","1");
        map.put("brandName","华为");
        map.put("companyName","华为");
        List<Brand> brandList=brandMapper.selectByCondition(map);
        System.out.println(brandList);

    }


}
