package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * spring-boot 对表单数据的校验
 * Author mzz
 * Create Date 2019/7/14
 **/
@Controller
public class UsersController {

    /**
     * 解决异常方式：可以在跳转页面的方法中注入一个Users对象，
     * 注意：由于springmvc会将该对象放入到Model中传递，key的名称会使用该对象驼峰式命名，
     * 所以参数变量名需要和对象的名称相同，将首字母小写
     *
     * 第二种：@ModelAttribute("user") 可以指定传递对象的名称实现，表示当前传递的对象为user,那么在页面获取的对象也应该修改为user
     * 添加用户页面
     * @return
     */
    @RequestMapping("/addUser")
    public String showpage(@ModelAttribute("user") Users users) {
        return "addUser";
    }

    /**
     * 保存用户数据
     * @param users 开启对User对象的数据校验
     * @param bindingResult  封装了校验的结果
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid Users users, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "addUser";
        }
        System.out.println(users.toString());
        return "ok";
    }
}
