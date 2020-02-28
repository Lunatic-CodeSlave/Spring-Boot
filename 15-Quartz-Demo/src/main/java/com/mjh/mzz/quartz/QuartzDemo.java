package com.mjh.mzz.quartz;

import com.mjh.mzz.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
//import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 定义任务类
 */
public class QuartzDemo implements Job {

    //@Autowired
    UserService userService = new UserService();
    /**
     * 任务被触发时执行
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        userService.addUsers();
        System.out.println("QuartzDemo is running...." + new Date());
    }
}
