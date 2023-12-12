package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname BrandMapper.xml
 * @Description
 * @Author Jaylan
 * @Date 2023/12/5 17:49
 * @Version 1.0.0
 */
public interface BrandMapper {
    List<Brand> selectAll();

    Brand selectById(Integer id);

    /**
     * @param status
     * @param companyName
     * @param brandName
     * @return
     * @Description 通过条件查询
     */
//    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
//    使用对象进行查询
    List<Brand> selectByCondition(Brand brand);


}
