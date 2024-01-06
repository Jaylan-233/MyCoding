/**
 * @Classname LoginServlet
 * @Description
 * @Author Jaylan
 * @Date 2023/11/13 10:38
 * @Version 1.0.0
 */
package com.example;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //将用户名和密码存储进request对象中
        request.setAttribute("username", "xiaoqian");
        request.setAttribute("password", "12345");
        //创建请求转发对象  参数是要转发的目标文件
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("test01.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("test02.jsp");
        // 使用转发对象的forward方法 forward:前进 向前
        //参数是请求对象和响应对象
        dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

