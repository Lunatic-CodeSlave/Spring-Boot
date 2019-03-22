package com.mjh.mzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * spring-boot HelloWorld
 * Author mzz
 * Create Date 2019/3/13 0013
 **/
@Controller
public class HelloWorld {

    @RequestMapping("/HelloWorld")
    @ResponseBody
    public Map<String,Object> showHelloWorld(){
        Map<String,Object> map = new HashMap<>();
        map.put("message","HelloWorld");
        return map;
    }
}
