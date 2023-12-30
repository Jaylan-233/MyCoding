package com.jaylan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname BookController
 * @Description
 * @Author Jaylan
 * @Date 2023/11/22 16:46
 * @Version 1.0.0
 */
/*说明这是控制层*/
@RestController
/*进行请求请求映射*/
@RequestMapping("/books")
public class BookController {
    /*get请求映射到的路径*/
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id==>" + id);
        return "hello , spring boot!";
    }
}
