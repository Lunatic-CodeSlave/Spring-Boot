package com.mjh.mzz.job;

import org.quartz.*;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class JobOne implements BaseJob {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap data=jobExecutionContext.getTrigger().getJobDataMap();
        Integer invokeParam = (Integer) data.get("invokeParam");
        //在这里实现业务逻辑
        System.out.println("JobOne开始运行,任务参数是:" + invokeParam);
    }
}
