package com.mjh.mzz.service;

import com.mjh.mzz.pojo.Users;

import java.util.List;

/**
 * spring-boot UserService层
 * Author mzz
 * Create Date 2019/6/30 0030
 **/
public interface UsersService {
    void addUser(Users users);
    List<Users> queryUserList();
    Users queryUserById(Integer id);
    void updateUser(Users user);
    void deleteUserById(Integer id);
}
