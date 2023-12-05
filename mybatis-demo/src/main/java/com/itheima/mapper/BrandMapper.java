package com.itheima.mapper;

import com.itheima.pojo.Brand;

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

}
