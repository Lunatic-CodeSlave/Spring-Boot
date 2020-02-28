Quartz定时任务框架（Java开源）

认识：
（1） job - 任务 - 你要做什么？
（2） Trigger - 触发器 - 你什么时候去做？
（3） Scheduler - 任务调度 - 你什么时候需要做什么？

实践：
（1） 在pom文件添加Quartz坐标
（2） 编写任务类，需实现Job类
（3） 创建Job类，编写测试代码main方法里