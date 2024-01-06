package example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Classname LoginServlet
 * @Description
 * @Author Jaylan
 * @Date 2023/12/20 19:50
 * @Version 1.0.0
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");//设置编码方式放置乱码
        PrintWriter out = response.getWriter();//创建输出对象
        if (username.equals("abc") && password.equals("123")) {
            out.println("登录成功");
        } else {
            out.println("登录失败");
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
