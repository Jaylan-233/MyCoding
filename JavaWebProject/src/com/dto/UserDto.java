package com.dto;

import com.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDto {
    /**
     * @param username 用户名
     * @param password 密码
     * @return 是否能登录的判断结果
     * @Description 用户登录方法
     */
    public static boolean Login(String username, String password) {
        boolean flag = false;
        //判断密码是否有效
        flag = isValidPassword(username, password);
        return flag;
    }

    /**
     * @param username 用户名
     * @param password 密码
     * @return 判断结果
     * @Description 判断密码是否正确
     */
    private static boolean isValidPassword(String username, String password) {
        boolean flag = false;
        //调用方法获取正确的密码
        String validPassword = getPasswordByUsername(username);
        //将输入的密码和正确的密码进行对比
        if (password.equals(validPassword))
            flag = true;
        return flag;
    }

    /**
     * @param username 用户名
     * @return password 获取到的密码
     * @Description 根据用户名获取对应的密码
     */
    private static String getPasswordByUsername(String username) {
        Connection connection = DruidUtils.getConnection();
        PreparedStatement preparedStatement = null;
        String password = null;
        ResultSet resultSet = null;
        String sql = "select password from user where username=?";
        try {
            //预编译SQL语句
            preparedStatement = connection.prepareStatement(sql);
            //设置填入参数
            preparedStatement.setString(1, username);
            //执行查询操作并存储到结果集中
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                password = resultSet.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.release(connection, preparedStatement);
        }
        return password;
    }


    /**
     * @Description 注册用户
     * @param username 用户名
     * @param password 密码
     * @return 1 注册是是否成功
     */
    public static boolean addUser(String username, String password) {
        Connection connection = DruidUtils.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "insert into user values(?,?)";
        boolean flag = false;
        try {
            // 判断用户名是否存在 不存在则执行增加记录操作
            if (!isExistByUsername(username)) {
                // 不存在则执行插入记录操作
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.execute();
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


    /**
     * @param username 要判断的用户名
     * @return 判断结果
     * @Description 判断用户名是否已经存在
     */
    private static boolean isExistByUsername(String username) {
        boolean flag = false;
        Connection connection = DruidUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from user where username=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


}
