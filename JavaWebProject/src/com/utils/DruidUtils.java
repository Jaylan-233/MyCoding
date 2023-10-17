package com.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Classname DruidUtils
 * @Description Druid数据库连接池工具类
 * @Author Jay lan
 * @Date 2023/9/18 10:25
 * @Version 1.0.0
 */
public class DruidUtils {

    private static final DataSource dataSource;

    // 1. 初始化连接池容器
    static {
        try {
            // 1.1加载druid.properties 配置文件
            InputStream in = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties properties = new Properties();
            properties.load(in);
            // 1.2通过druid的工厂方法，创建连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException("druid连接池初始化失败...");
        }
    }

    // 2. 提供获取连接池对象的静态方法
    public static DataSource getDataSource() {
        return dataSource;
    }

    // 3.提供获取连接对象静态方法
    public static Connection getConnection() {
        //创建连接对象
        Connection connection = null;
        try {
            //获得连接池对象
            connection = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    // 4. 回收资源方法
    public static void release(Connection connection, PreparedStatement preparedStatement) {
        try {
            if (connection != null) connection.close();
            if (preparedStatement != null) preparedStatement.close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }


}
