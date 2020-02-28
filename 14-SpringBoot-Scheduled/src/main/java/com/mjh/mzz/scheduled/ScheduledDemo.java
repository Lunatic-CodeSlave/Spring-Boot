package com.mjh.mzz.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Scheduled定时任务
 */
@Component
public class ScheduledDemo {

    /**
     * 定时任务
     * @Scheduled 注解设置定时任务
     * cron属性:cron表达式，定时任务触发时 设置时间的一个字符串表达式
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduledMethod() {
        System.out.println("定时任务触发" + new Date());
    }
}
