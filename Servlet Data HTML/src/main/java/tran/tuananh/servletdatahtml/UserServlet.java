package tran.tuananh.servletdatahtml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/add-user"})
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        printWriter.println("name: " + name + "<br>age: " + age + "<br>address: " + address);
    }
}
