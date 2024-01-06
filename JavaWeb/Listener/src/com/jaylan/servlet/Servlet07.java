package com.qfedu.servlet;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.qfedu.bean.UserInfo;
import com.qfedu.listener.TestListener09;
public class Servlet07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		TestListener09 bean = new TestListener09();
		bean.setUsername(username);
		bean.setPassword(password);
		String id = UUID.randomUUID().toString();
		bean.setId(id);
		request.getSession().setAttribute("bean", bean);
		Map beanMap = UserInfo.getInstance().getBeanMap();
		request.setAttribute("beanMap", beanMap);
		request.getRequestDispatcher("/jsp/jsp01.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
