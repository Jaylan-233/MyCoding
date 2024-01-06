package com.example.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname TestJSP02
 * @Description 登录Servlet
 * @Author Jaylan
 * @Date 2023/10/20 17:53
 * @Version 1.0.0
 */
@WebServlet("/testJSP01")
public class TestJSP01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String username=req.getParameter("username");
        PrintWriter out=resp.getWriter();
        out.print("<html>");
            out.print("<title>hello</title>");
            out.print("<body>");
//            只有下面这一句要进行动态的改变  HTML相关代码 的静态的 不过在编写的时候还是要进行输出
                out.print("<h2>Hello,"+username+"</h2>");
            out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        doGet(req,resp);
    }

}
