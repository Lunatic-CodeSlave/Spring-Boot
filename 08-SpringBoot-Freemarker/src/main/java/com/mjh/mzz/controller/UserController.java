package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * spring-boot 整合Freemarker技术
 * Author mzz
 * Create Date 2019/6/16 0016
 **/
@Controller
public class UserController {
    /*
     * 处理请求返回数据
     */
    @RequestMapping("/showUser")
    public String showUser(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",3));
        list.add(new Users(2,"李四",4));
        list.add(new Users(3,"王五",5));
        //将list对象注入到model中
        model.addAttribute("list",list);
        //跳转视图
        return "userlist";
    }
}
