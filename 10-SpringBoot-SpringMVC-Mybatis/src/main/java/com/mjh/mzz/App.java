package com.mjh.mzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot-Mabatis-springMVC
 *
 */
@SpringBootApplication
@MapperScan("com.mjh.mzz.mapper") //@MapperScan 整合mybatis时，用于扫描Mapper接口（相当于在mapper接口添加@Mapper注解）
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);
    }
}
