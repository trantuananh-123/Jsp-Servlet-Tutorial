
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tom1810-183-59
 */
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Xin chao Tuan Anh");

        Cookie cookie1 = new Cookie("name", URLEncoder.encode("Trần Tuấn Anh", "UTF-8"));
        cookie1.setMaxAge(5);

        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("age", URLEncoder.encode("22", "UTF-8"));
        cookie2.setMaxAge(10);

        resp.addCookie(cookie2);
    }

}
