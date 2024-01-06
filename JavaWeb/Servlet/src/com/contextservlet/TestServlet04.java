package com.contextservlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Description ServletContext基本使用
 */
@WebServlet("/testServlet04")
public class TestServlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        ServletContext context=this.getServletContext();
        context.setAttribute("author","Xi233");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {
        doGet(req,resp);
    }
}
