package com.mjh.mzz;

import com.mjh.mzz.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * spring-boot SpringBoot整理Servlet第2种方式
 * Author mzz
 * Create Date 2019/3/18 0018
 **/
@SpringBootApplication
public class SpringBootStart2 {
    public static void main(String args[]){
        SpringApplication.run(SpringBootStart2.class,args);
    }
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addUrlMappings("/secondServlet");
        return servletRegistrationBean;
    }
}
