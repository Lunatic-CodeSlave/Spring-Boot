package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * spring-boot spring-boot 整合jsp
 * Author mzz
 * Create Date 2019/5/25 0025
 **/
@Controller
public class UserController {
    /*
     * 处理请求返回数据
     */
    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<Users> list = new ArrayList<Users>();
        list.add(new Users(1,"张三",3));
        list.add(new Users(2,"李四",4));
        list.add(new Users(3,"王五",5));
        //将list对象注入到model中
        model.addAttribute("list",list);
        //跳转视图
        return "userlist";
    }
}
