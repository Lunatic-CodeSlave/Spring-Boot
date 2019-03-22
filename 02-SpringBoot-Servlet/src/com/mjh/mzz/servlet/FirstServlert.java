package com.mjh.mzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring-boot SpringBoot整理Servlet
 * Author mzz
 * Create Date 2019/3/18 0018
 *
 *
 **/
@WebServlet(name = "FirstServlert",urlPatterns = "/firstServlet")
public class FirstServlert extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("my first Servlet:===========");
    }
}
