package com.mjh.mzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * spring-boot SpringBoot整理Servlet
 * Author mzz
 * Create Date 2019/3/18 0018
 **/
@SpringBootApplication
@ServletComponentScan
public class SpringBootStart {
    public static void main(String args[]){
        SpringApplication.run(SpringBootStart.class,args);
    }
}
