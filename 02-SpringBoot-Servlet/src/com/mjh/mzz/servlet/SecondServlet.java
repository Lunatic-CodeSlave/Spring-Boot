package com.mjh.mzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring-boot SpringBoot整理Servlet第2种方式
 * Author mzz
 * Create Date 2019/3/18 0018
 **/
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("my second Servlet:===========");
    }
}
