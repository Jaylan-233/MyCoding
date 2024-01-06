package com.execrise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @Classname LoginServlet02
 * @Description
 * @Author Jaylan
 * @Date 2023/11/2 16:21
 * @Version 1.0.0
 */
@WebServlet("/LoginServlet02")
public class LoginServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
//        设置相应页面格式及
        resp.setContentType("text/html;charset=utf-8");
//        获取输出对象 用于将内容直接输出
        PrintWriter out=resp.getWriter();
//        将获取到的内容直接写入到页面中
        out.print("通过Session获取到的username="+session.getAttribute("username"));
        out.println("<br>");
        out.print("通过Session获取到的password="+session.getAttribute("password"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
