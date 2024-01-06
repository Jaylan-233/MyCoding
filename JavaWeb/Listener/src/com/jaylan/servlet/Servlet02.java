package com.jaylan.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Servlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取HttpSession对象
		HttpSession session = request.getSession();
		//HttpSession对象添加属性
		session.setAttribute("username", "xiaoqian");
		//HttpSession对象修改属性
		session.setAttribute("username", "xiaofeng");
		//HttpSession对象删除属性
		session.removeAttribute("username");
		//销毁当前HttpSession对象
		session.invalidate();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
