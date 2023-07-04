package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;


/**
 * 1. 파라메터 전송 기능
 * http://localhost:8080/request-param?name=hello&age=20
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> e = req.getParameterNames();

        System.out.println("start");
        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println("name = " + req.getParameter(paramName)));
        System.out.println("end ");

        System.out.println(req.getParameter("username"));

        String a = req.getParameter("age");

        System.out.println("a = " + a);

        String[] values = req.getParameterValues("username");

        for (String value : values) {
            System.out.println("values = " + value);
        }



        resp.getWriter().write("ok");

    }

}
