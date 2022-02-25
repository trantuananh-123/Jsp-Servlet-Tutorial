
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
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
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        Cookie[] cookies = req.getCookies();

        for (Cookie c : cookies) {
            printWriter.println(URLDecoder.decode(c.getName(), "UTF-8") + ": " +
                    URLDecoder.decode(c.getValue(), "UTF-8") + "<br/>");

            if (URLDecoder.decode(c.getName(), "UTF-8").equals("age")) {
                c.setMaxAge(0);
            }
            resp.addCookie(c);
        }
    }

}
