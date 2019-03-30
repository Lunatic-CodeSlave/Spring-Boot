package com.mjh.mzz.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * spring-boot SpringBoot整合Servlet第2种方式
 * Author mzz
 * Create Date 2019/3/20 0020
 **/
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入到secondFilter============");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开secondFilter============");
    }

    @Override
    public void destroy() {

    }
}
