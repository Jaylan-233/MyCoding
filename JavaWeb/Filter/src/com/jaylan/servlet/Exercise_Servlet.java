package com.jaylan.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Exercise_Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		if (username.length()>0) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect(request.getContextPath()+"/exercise_welcome.html");
		}else{
			response.sendRedirect(request.getContextPath()+"/exercise_login.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
