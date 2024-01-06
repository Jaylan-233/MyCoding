/**
 * @Classname Servlet
 * @Description
 * @Author Jaylan
 * @Date 2023/11/13 11:17
 * @Version 1.0.0
 */
package com.example;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.User;

public class Servlet01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(); //创建一个User对象
        user.setUsername("xiaoqian");//设置User
        //将user对象存入request对象
        //创建一个数组 用来存姓名
        //键 值
        request.setAttribute("user", user);
        String[] arr = {"xiaoqian", "xiaofeng"};
        //将arr对象存入request对象
        request.setAttribute("arr", arr);
        //将userArr用来存贮user对象 对象存入request对象
        User[] userArr = {user};
        request.setAttribute("userArr", userArr);
        //将map对象存入request对象
        //使用HashMap进行存贮
        HashMap<String, String> map = new HashMap<>();
        //把key 和value 放入map中
        map.put("username", "xiaoqian");
        request.setAttribute("map", map);
        //将请求转发到相应的jsp页面
        //创建转发对象  参数是 要转发的目标页面
        //request 放了多个对象 4个 user arr userArr map四个对象啊
//        请求转发 url 不变
//        重定向 两次请求  url改变
        RequestDispatcher dispatcher = request.getRequestDispatcher("test04.jsp");
//      使用dispatcher对象的请求转发
        dispatcher.forward(request, response);
//        也可以写成一串  创建完成对象的同时 执行其方法 能这么写 但不建议 可读性 比较差
//         RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/test04.jsp").forward(request,response)
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

