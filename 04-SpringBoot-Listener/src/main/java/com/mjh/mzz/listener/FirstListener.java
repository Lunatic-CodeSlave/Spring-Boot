package com.mjh.mzz.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * spring-boot Spring-boot 整合Listener
 * Author mzz
 * Create Date 2019/3/30 0030
 **/
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener.......initial........");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("FirstListener.......destroy........");
    }
}
