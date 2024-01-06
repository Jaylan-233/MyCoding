package com.execrise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Classname LoginServlet
 * @Description
 * @Author Jaylan
 * @Date 2023/11/2 16:01
 * @Version 1.0.0
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置相应内容格式和字符集防止中文乱码
        resp.setContentType("text/html;charset=utf-8");
        //        获取用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        将用户名和密码存储到Session对象中
//        1.创建Session对象
        HttpSession session = req.getSession();
//       2.将数据放入Session对象中
//          使用session对兑现给的setAttribute对象 以键值对的形式存放
        session.setAttribute("username", username);
        session.setAttribute("password", password);
//   重定向到另外一个页面 连同Session对象一起带过去
        resp.sendRedirect("LoginServlet02");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
