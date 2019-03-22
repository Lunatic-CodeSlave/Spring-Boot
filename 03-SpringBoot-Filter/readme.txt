1、原先filter在tomcat的web.xml里的配置
    <filter>
        <filter-name>FirstFilter</filter-name>
        <filter-class>com.mjh.mzz.filter.Firstfilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>Firstfilter<filter-name>
        <serlet-pattern>/first<serlet-pattern>
    <filter-mapping>
2.springboot用注解
   @WebFilter(filterName = "FirstFilter",urlPatterns = "/first")
   @WebFilter(filterName = "FirstFilter",urlPatterns = {"*.do","*.servlet"."*.jsp"})拦截多个url
    等价于上面的配置
3.编写启动类
    第一种方式
        @ServletComponentScan在SpringBoot启动时会自动扫描@WebFilter注解，并将该类实例化
    第二种方式
        不需要添加@ServletComponentScan和@WebFilter注解，
        在启动类里添加方法返回值必须是FilterRegistrationBean,并添加注解@Bean注解