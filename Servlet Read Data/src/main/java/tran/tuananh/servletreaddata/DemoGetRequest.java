package tran.tuananh.servletreaddata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/get-request"})
public class DemoGetRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("test");

        String name = req.getParameter("name");
        String course = req.getParameter("course");

        printWriter.println("<br><h1>" + name + "</h1>");
        printWriter.println("<br><h3>" + course + "</h3>");

        printWriter.close();
    }
}
