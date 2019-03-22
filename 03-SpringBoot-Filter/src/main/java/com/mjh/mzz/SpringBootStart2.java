package com.mjh.mzz;

import com.mjh.mzz.filter.SecondFilter;
import com.mjh.mzz.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * spring-boot HelloWorld
 * Author mzz
 * Create Date 2019/3/20 0020
 **/
@SpringBootApplication
public class SpringBootStart2 {
    public static void main(String args[]){
        SpringApplication.run(SpringBootStart2.class,args);
    }

    /**
     * 注册servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/secondServlet");
        return bean;
    }

    /**
     * 注册filter
     * @return
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//        bean.addUrlPatterns(new String[]{"*.do","*.servlet","*.jsp"});添加多个拦截
        bean.addUrlPatterns("/secondServlet");
        return bean;
    }
}
