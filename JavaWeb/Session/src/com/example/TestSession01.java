package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
/**
 * @Classname TestSession02
 * @Description Session的基本运用
 * @Author Jaylan
 * @Date 2023/11/2 17:07
 * @Version 1.0.0
 */
@WebServlet("/TestSession01")
public class TestSession01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        //获取Session对象
        HttpSession session = request.getSession();
        //从Session对象中获取购物车，如果返回NULL，就创建一个购物车对象
        HashMap<String, Integer> shoppingCar = (HashMap<String, Integer>) session.getAttribute("shoppingCar");
//        如果购物车为空就创建一个新的购物车
        if (null == shoppingCar) {
//            购物车以键和值对的形式
            shoppingCar = new HashMap<>();
        }
        //获取表单提交的参数数组，数组里封装了要购买的所有书的序号
        String[] bookNums = request.getParameterValues("book");
        if (null != bookNums && bookNums.length > 0) {
            String bookName = null;
            //遍历数组，根据书的序号配置书的名称
            for (String bookNum : bookNums) {
                switch (bookNum) {
                    case "1":
                        bookName = "Java语言程序设计";
                        break;
                    case "2":
                        bookName = "Java Web开发实战";
                        break;
                    case "3":
                        bookName = "Java EE（SSM框架）企业应用实战";
                        break;
                }
                //判断该书名称是否在购物车中，如果在，数量加1，如果不在，添加一个新的key/value对
                if (shoppingCar.containsKey(bookName)) {
                    shoppingCar.put(bookName, shoppingCar.get(bookName) + 1);
                } else {
                    shoppingCar.put(bookName, 1);
                }
            }
        }
        //将修改后的购物车重新放入Session对象
        session.setAttribute("shoppingCar", shoppingCar);
        String encodeRedirectURL = response.encodeRedirectURL("TestSession02");
        //将请求重定向到TestSession03
        response.sendRedirect(encodeRedirectURL);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
