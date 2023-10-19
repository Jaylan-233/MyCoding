package com.servlet;

import com.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/userRegister")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取username的值
        String username=req.getParameter("username");
        //获取password的值
        String password=req.getParameter("password");
        //指定响应内容格式和编码方式 防止中文乱码
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        if(UserDto.addUser(username,password))
        {
            //注册成功就定向到登录界面
            System.out.println("RegisterSuccess!");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
        else
        {
            out.write("<script language='javascript'>alert('注册失败!,账号有误或用户名已存在')</script>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
