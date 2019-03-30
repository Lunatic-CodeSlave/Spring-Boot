1、原先listener在tomcat的web.xml里的配置
    <listener>
        <listener-class>com.mjh.mzz.listener.FirstListener</listener-class>
    </listener>
2.springboot用注解
   @WebListener()    等价于上面的配置
3.编写启动类
    第一种方式
        @ServletComponentScan在SpringBoot启动时会自动扫描@WebListener注解，并将该类实例化
    第二种方式
        不需要添加@ServletComponentScan和@WebListener注解，
        在启动类里添加方法返回值必须是ServletListenerRegistrationBean,并添加注解@Bean注解