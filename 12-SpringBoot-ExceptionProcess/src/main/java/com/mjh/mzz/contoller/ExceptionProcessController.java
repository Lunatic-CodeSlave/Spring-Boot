package com.mjh.mzz.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.tree.ExpandVetoException;

/**
 * spring-boot 异常处理:自定义错误页面
 * Author mzz
 * Create Date 2019/7/17 0017
 **/
@Controller
public class ExceptionProcessController {

    @RequestMapping("/show")
    public String showInfo() {
        String s = null;
        s.length();
        return "index";
    }
    @RequestMapping("/show2")
    public String showInfo2() {
        int i = 10/0;
        return "index";
    }
    /**
     * java.lang.NullPointerException
     * 该方法需要返回一个ModelAndView目的是可以封装异常信息以及指定视图
     * @param exception 会将产生的异常对象注入到方法中
     */
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView NullPointerExceptionHandler(Exception exception) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error2",exception.toString());
        modelAndView.setViewName("error2");
        return modelAndView;
    }
    /**
     * java.lang.ArithmeticException
     * 该方法需要返回一个ModelAndView目的是可以封装异常信息以及指定视图
     * @param exception 会将产生的异常对象注入到方法中
     */
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView ArithmeticExceptionHandler(Exception exception) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error1",exception.toString());
        modelAndView.setViewName("error1");
        return modelAndView;
    }
}
