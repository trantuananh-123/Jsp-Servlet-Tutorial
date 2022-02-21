package tran.tuananh.servletconfig;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = {"/"}, name = "DemoServlet", initParams = {
//        @WebInitParam(name = "name", value = "Trần Tuấn Anh")
//})
public class ServletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = super.getServletConfig().getInitParameter("client name");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1> Xin chào " + name + "</h1>");
        printWriter.close();
    }
}
