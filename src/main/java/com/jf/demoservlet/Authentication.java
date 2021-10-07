package com.jf.demoservlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "hello", value = "/hello")
public class Authentication extends HttpServlet {

    public void destroy() {
    }
}