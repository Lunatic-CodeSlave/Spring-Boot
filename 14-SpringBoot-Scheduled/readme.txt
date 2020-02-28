SpringBoot定时任务

1. 编写定时任务demo
    在启动类上增加@EnableScheduling注解,开启定时任务处理；
    编写组件，@Scheduled注解设置具体的定时任务

2. cron表达式：是一个字符串，分为6个或7个域，每个域代表一个含义，结构从左到右（用空格隔开）：秒 分 时 月中的日期 月 星期中的日期 年
    有俩种格式：（1）senconds minutes hours day month week year
                （2）senconds minutes hours day month week

                 域          允许值             允许特殊字符
                --------------------------------------------
                 秒           0-59                , - * /
                分钟          0-59                , - * /
                小时          0-23                , - * / L W C
                 日           1-31                , - * / ?
                 月           1-12                , - * /
                星期           1-7                , - * / ? L C #
              年（可选）    1970-2099              , - * /

    详解可参照：https://www.cnblogs.com/yanghj010/p/10875151.html



