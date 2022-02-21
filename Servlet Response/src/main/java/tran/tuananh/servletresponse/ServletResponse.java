package tran.tuananh.servletresponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/"}, name = "DemoServlet")
public class ServletResponse extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Servlet Response<h1>");
        printWriter.close();

        resp.addCookie(new Cookie("a", "a"));
        resp.addHeader("a", "aaa");
        resp.sendError(401);
    }
}
