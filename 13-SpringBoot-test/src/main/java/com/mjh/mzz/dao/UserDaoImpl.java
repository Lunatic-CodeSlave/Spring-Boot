package com.mjh.mzz.dao;

import org.springframework.stereotype.Repository;

/**
 * spring-boot springboot单元测试
 * Author mzz
 * Create Date 2019/8/3 0003
 **/
@Repository
public class UserDaoImpl {
    public void saveUser() {
        System.out.println("insert into users......");
    }
}
