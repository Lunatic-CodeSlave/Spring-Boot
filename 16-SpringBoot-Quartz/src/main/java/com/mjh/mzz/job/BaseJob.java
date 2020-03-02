package com.mjh.mzz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * jobGroup基础接口,自己实现业务逻辑的job类都要实现这个接口
 * 创建任务时要用
 */
public interface BaseJob extends Job {
    void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException;
}
