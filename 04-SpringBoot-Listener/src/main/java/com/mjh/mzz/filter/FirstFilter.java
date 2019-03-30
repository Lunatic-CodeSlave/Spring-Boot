package com.mjh.mzz.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * spring-boot SpringBoot整合filter
 * Author mzz
 * Create Date 2019/3/19 0019
 **/
@WebFilter(filterName = "FirstFilter",urlPatterns = "/firstServlet")
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入到firstFilter============");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开firstFilter============");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
