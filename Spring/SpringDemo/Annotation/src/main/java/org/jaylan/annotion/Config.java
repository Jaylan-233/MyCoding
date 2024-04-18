package org.jaylan.annotion;


import org.springframework.context.annotation.ComponentScan;

// 有注解标识才 扫描进来
// 指定扫描扫描地方 交给容器管理
//指定要扫的包 执行包扫描的类
@ComponentScan("org.jaylan")
public class Config {

}
