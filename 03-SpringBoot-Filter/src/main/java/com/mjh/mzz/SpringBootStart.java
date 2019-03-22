package com.mjh.mzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * spring-boot SpringBoot整合filter
 * Author mzz
 * Create Date 2019/3/20 0020
 **/
@SpringBootApplication
@ServletComponentScan
public class SpringBootStart {
    public static void main(String args[]){
        SpringApplication.run(SpringBootStart.class,args);
    }
}
