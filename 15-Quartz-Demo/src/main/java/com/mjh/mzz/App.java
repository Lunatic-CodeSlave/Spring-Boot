package com.mjh.mzz;

import com.mjh.mzz.quartz.QuartzDemo;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Quartz定时任务
 *
 */
public class App 
{
    public static void main( String[] args ) throws SchedulerException {
//        System.out.println( "Hello World!" );

        //        1、 创建job对象， 你要做什么？
        JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();

        //        2、 创建Trigger对象， 你什么时候去做？
        /**
         * (1) 简单的Trigger触发时间，通过Quartz提供一个方法来完成简单的重复调用
         * (2) cron Trigger，按照cron表达式来给定触发时间
         */
        //Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.repeatSecondlyForever()).build();
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?")).build();

        //        3、 创建Scheduler对象， 在什么时间做什么事情？
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(job,trigger);

        // 启动
        scheduler.start();
    }
}
