package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.Users;
import com.mjh.mzz.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam.Mode;
import java.util.List;

/**
 * spring-boot UsersController层
 * Author mzz
 * Create Date 2019/6/30 0030
 **/
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 添加用户
     * @param users
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        this.usersService.addUser(users);
        return "ok";
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping("/queryUserList")
    public String queryUsersList(Model model) {
        List<Users> usersList = this.usersService.queryUserList();
        model.addAttribute("usersList",usersList);
        return "showUsers";
    }

    /**
     * 根据用户ID查询用户信息
     * @param model
     * @return
     */
    @RequestMapping("/queryUserById")
    public String queryUserById(Model model,Integer id) {
        Users user = this.usersService.queryUserById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }

    /**
     * 修改用户
     * @return
     */
    @RequestMapping("/editUser")
    public String updateUser(Users user) {
        this.usersService.updateUser(user);
        return "ok";
    }

    /**
     * 通过用户ID删除用户
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser")
    public String deleteUserById(Integer id) {
        this.usersService.deleteUserById(id);
        return "redirect:/users/queryUserList";
    }
}
