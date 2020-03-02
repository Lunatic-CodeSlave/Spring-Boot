package com.mjh.mzz.controller;

import com.mjh.mzz.pojo.AppQuartz;
import com.mjh.mzz.service.QuartzService;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 封装定时任务
 */
@RestController
@RequestMapping("/quartz")
public class QuartzController {

    @Autowired
    private QuartzService quartzService;

    //测试
    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test() throws Exception {
        return "success";
    }

    //添加一个job
    @RequestMapping(value="/addJob",method=RequestMethod.POST)
    public String addjob(@RequestBody AppQuartz appQuartz) throws Exception {
        return quartzService.addJob(appQuartz);
    }

    //暂停job
    @RequestMapping(value="/pauseJob",method=RequestMethod.POST)
    public String pausejob(@RequestBody Integer[]quartzIds) {
        try {
            return quartzService.pausejob(quartzIds);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    //恢复job
    @RequestMapping(value="/resumeJob",method=RequestMethod.POST)
    public String resumejob(@RequestBody Integer[]quartzIds){
        try {
            return quartzService.resumejob(quartzIds);
        } catch (SchedulerException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


    //删除job
    @RequestMapping(value="/deletJob",method=RequestMethod.POST)
    public String deletjob(@RequestBody Integer[]quartzIds){
        try {
            return quartzService.deletjob(quartzIds);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    //修改
    @RequestMapping(value="/updateJob",method= RequestMethod.POST)
    public String  modifyJob(@RequestBody AppQuartz appQuartz){
        try {
            return quartzService.modifyJob(appQuartz);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    //暂停所有
    @RequestMapping(value="/pauseAll",method=RequestMethod.GET)
    public String pauseAllJob(){
        try {
            return quartzService.pauseAllJob();
        } catch (SchedulerException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    //恢复所有
    @RequestMapping(value="/repauseAll",method=RequestMethod.GET)
    public String repauseAllJob() throws Exception {
        return quartzService.resumeAllJob();
    }

    //添加一个job1
    @RequestMapping(value="/addCronJob1",method=RequestMethod.GET)
    public String addCronjob1() throws Exception {
        AppQuartz appQuartz = new AppQuartz();
        appQuartz.setCronExpression("0/5 * * * * ?");
        appQuartz.setInvokeParam(1);
        appQuartz.setJobClassname("JobOne");
        return quartzService.addCronJob(appQuartz);
    }

    //添加一个job2
    @RequestMapping(value="/addCronJob2",method=RequestMethod.GET)
    public String addCronjob2() throws Exception {
        AppQuartz appQuartz = new AppQuartz();
        appQuartz.setCronExpression("0/10 * * * * ?");
        appQuartz.setInvokeParam(2);
        appQuartz.setJobClassname("JobTwo");
        return quartzService.addCronJob(appQuartz);
    }
}
