package com.mjh.mzz.mapper;

import com.mjh.mzz.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * spring-boot UsersMapper
 * Author mzz
 * Create Date 2019/6/30 0030
 **/
//@Mapper
public interface UsersMapper {
    void insertUser(Users user);
    List<Users> queryUserList();
    Users queryUserById(Integer id);
    void updateUser(Users user);
    void deleteUserById(Integer id);
}
