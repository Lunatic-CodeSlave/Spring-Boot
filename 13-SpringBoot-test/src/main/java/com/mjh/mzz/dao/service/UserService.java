package com.mjh.mzz.dao.service;

import com.mjh.mzz.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * spring-boot springboot单元测试
 * Author mzz
 * Create Date 2019/8/3 0003
 **/
@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;
    public void addUser() {
        this.userDaoImpl.saveUser();
    }
}
