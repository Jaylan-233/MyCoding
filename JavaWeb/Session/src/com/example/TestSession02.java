package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @Classname TestSession02
 * @Description
 * @Author Jaylan
 * @Date 2023/11/2 17:07
 * @Version 1.0.0
 */
@WebServlet("/TestSession02")
public class TestSession02 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //获取Session对象
        HttpSession session = request.getSession();
        //从Session对象中获取购物车
        HashMap<String, Integer> shoppingCar = (HashMap<String, Integer>) session.getAttribute("shoppingCar");
        if (null != shoppingCar && !shoppingCar.isEmpty()) {
            out.println("你购买的书籍有：" + "<br>");
            //遍历购物车的key集合，根据Key值获取相应的数量
            for (String bookName : shoppingCar.keySet()) {
                out.println(bookName + ":" + shoppingCar.get(bookName) + "本<br>");
            }
        } else {
            out.println("你还没有购买任何书籍！<br>");
        }
        String encodeURL = response.encodeURL("buy.html");
        out.println("<a href=" + encodeURL + ">继续购买</a>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
