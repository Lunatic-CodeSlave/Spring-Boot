package com.mjh.mzz.job;

import org.quartz.*;
import org.springframework.stereotype.Component;

@Component
@PersistJobDataAfterExecution//防并发，上一个任务完成前写入需要被下一个任务获取的变量以及对应的属性值，类似求和累加
@DisallowConcurrentExecution//防并发，保证上一次任务执行完毕再执行下一任务
public class JobOne implements BaseJob {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap data=jobExecutionContext.getTrigger().getJobDataMap();
        Integer invokeParam = (Integer) data.get("invokeParam");
        //在这里实现业务逻辑
        System.out.println("JobOne开始运行,任务参数是:" + invokeParam);
    }
}
