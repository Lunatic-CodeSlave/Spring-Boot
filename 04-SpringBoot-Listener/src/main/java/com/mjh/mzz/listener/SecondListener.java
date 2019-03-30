package com.mjh.mzz.listener;

import javax.servlet.Servlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * spring-boot Spring-boot 整合Listener方式二
 * Author mzz
 * Create Date 2019/3/30 0030
 **/
public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SecondListener.......initial......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("SecondListener.......destroy......");
    }
}
