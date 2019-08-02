package com.mjh.mzz.contoller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * spring-boot 异常处理:通过实现HandlerExceptionResolver处理全局异常
 * Author mzz
 * Create Date 2019/8/2 0002
 **/
@Configuration
public class GlobalExceptionController3 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，跳转不同的视图
        if(ex instanceof ArithmeticException) {
            mv.setViewName("error3");
        }
        if(ex instanceof NullPointerException) {
            mv.setViewName("error3");
        }
        mv.addObject("error",ex.toString());
        return mv;
    }
}
