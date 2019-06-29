package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * spring-boot 整合Thymeleaf技术
 * Author mzz
 * Create Date 2019/6/16 0016
 **/
@Controller
public class DemoThymeleafController {

    /**
     * Thymeleaf的一个示例
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String showInfo(Model model) {
        model.addAttribute("message","Thymeleaf的一个试例");
        model.addAttribute("key",new Date());
        return "index";
    }
    @RequestMapping("/show2")
    public String showInfo2(Model model){
        model.addAttribute("sex","男");
        model.addAttribute("id","2");
        return "index2";
    }
    @RequestMapping("/show3")
    public String showInfo3(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",20));
        list.add(new Users(2,"李四",21));
        list.add(new Users(3,"王五",22));
        model.addAttribute("list",list);
        return "index3";
    }
    @RequestMapping("/show4")
    public String showInfo4(Model model) {
        Map<String,Users> map = new HashMap<>();
        map.put("u1",new Users(1,"张三",20));
        map.put("u2",new Users(2,"李四",21));
        map.put("u3",new Users(3,"王五",22));
        model.addAttribute("map",map);
        return "index4";
    }
    @RequestMapping("/show5")
    public String showInfo5(Model model, HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("request","HttpServletRequest");
        httpServletRequest.getSession().setAttribute("session","HttpSession");
        httpServletRequest.getSession().getServletContext().setAttribute("application","Application");
        return "index5";
    }
    @RequestMapping("/{page}")
    public String showInfo6(@PathVariable String page,Integer id,String name) {
        System.out.println(id);
        System.out.println(name);
        return page;
    }
}
