import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Classname TestCookie01
 * @Description
 * @Author Jaylan
 * @Date 2023/10/20 12:16
 * @Version 1.0.0
 */
@WebServlet("/testCookie01")
public class TestCookie01 extends HttpServlet {
    //    用来标识Cookie个数
    int count = 1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        设置响应方式和字符编码防止中文乱码
//        指定了输出内容的格式为text/html那么换行就应该用html中的<br>而不是\n来实现
        resp.setContentType("text/html;charset=utf-8");
//       创建输出对象
        PrintWriter out = resp.getWriter();
//        获取所有包含Cookie对象的数组
        Cookie[] cookies = req.getCookies();
//        不为空的情况下获取所有字段
        //        可以使用ForEach代替
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                out.print("Cookie name=" + cookies[i].getName() + "<br>");
                out.print("Cookie value=" + cookies[i].getValue() + "<br>");
                out.print("Cookie maxAge=" + cookies[i].getMaxAge() + "<br>");
            }
        } else {
            out.print("没有Cookie");
        }
//        创建Cookie对象 并将Cookie返回到客户端
//        访问几次创建几个Cookie对象
        Cookie cookie = new Cookie("cookieName" + count, "coolieVale" + count);
        resp.addCookie(cookie);
        count++;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

    }
}
