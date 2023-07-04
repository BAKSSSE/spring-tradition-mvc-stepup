package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // [status-line]
//        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        // [response-header]
//        response.setHeader("Content-Type", "text/plain;charset=utf-8");
//        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//        response.setHeader("Pragma", "no-cache");
//        response.setHeader("my-header", "my");


        // [cookie]
//        Cookie cookie = new Cookie("myCook", "c");
//        cookie.setMaxAge(100);
//        response.addCookie(cookie);


        // [Redirect]
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Location", "/basic/hello-form.html");
//        response.getWriter().write("성공");

        //[short Redirect]
//        response.sendRedirect("/basic/hello-form.html");

        response.getWriter().write("성공");
    }
}
