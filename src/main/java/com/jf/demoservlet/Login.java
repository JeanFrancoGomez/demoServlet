package com.jf.demoservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String user = req.getParameter("floatingInput");
        //resp.addCookie(new Cookie("nameUser", user));
        resp.getWriter().write(user);
        req.getServletContext().getRequestDispatcher("login.jsp").include(req,resp);

    }
}
