package tran.tuananh.servletdatahtml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/form-user"})
public class UserForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action='/add-user' method='post'>");
        printWriter.println("name: <input type='text' name='name'>");
        printWriter.println("age: <input type='text' name='age'>");
        printWriter.println("address: <input type='text' name='address'>");
        printWriter.println("<input type='submit' value='submit'>");
        printWriter.println("</form>");

        printWriter.close();
    }
}
