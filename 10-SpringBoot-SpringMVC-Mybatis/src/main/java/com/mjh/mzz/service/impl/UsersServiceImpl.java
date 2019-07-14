package com.mjh.mzz.service.impl;

import com.mjh.mzz.mapper.UsersMapper;
import com.mjh.mzz.pojo.Users;
import com.mjh.mzz.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;

/**
 * spring-boot userService实现类
 * Author mzz
 * Create Date 2019/6/30 0030
 **/
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }

    @Override
    public List<Users> queryUserList() {
        List<Users> usersList = this.usersMapper.queryUserList();
        return usersList;
    }

    @Override
    public Users queryUserById(Integer id) {
       Users usersListById = this.usersMapper.queryUserById(id);
        return usersListById;
    }

    @Override
    public void updateUser(Users user) {
        this.usersMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.usersMapper.deleteUserById(id);
    }
}
