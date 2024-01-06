package com.qfedu.servlet;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.qfedu.bean.UserInfo;
public class Servlet08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("bean");
		Map beanMap = UserInfo.getInstance().getBeanMap();
		request.setAttribute("beanMap", beanMap);
	    request.getRequestDispatcher("/jsp/jsp01.jsp").forward(request, response);;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
