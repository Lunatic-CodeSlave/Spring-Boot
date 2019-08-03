package com.mjh.mzz;

import com.mjh.mzz.dao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring-boot springboot单元测试
 * @RunWith 启动器
 * SpringJUnit4ClassRunner.class 让Junit于Spring环境进行整合
 * @SpringBootTest(classes = {App.class}) 当前类为springBoot的测试类,是个数组可添加多个启动类
 * @SpringBootTest(classes = {App.class}) 让这个测试类加载Spring boot启动类，用于启动springboot
 *
 * Junit 与spring整合需添加 @ContextConfiguartion("classpath:applicationContext.xml")
 * Author mzz
 * Create Date 2019/8/3 0003
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void testAddUser() {
        this.userService.addUser();
    }
}
