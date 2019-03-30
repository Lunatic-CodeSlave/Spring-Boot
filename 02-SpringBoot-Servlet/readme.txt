1.原先servlet在tomcat的web.xml里的配置
    <servlet>
        <servlet-name>FirstServlet</servlet-name>
        <servlet-class>com.mjh.mzz.servlet.FirstServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>FirstServlet<servlet-name>
        <serlet-pattern>/firstServlet<serlet-pattern>
    <servlet-mapping>
2.springboot用注解
    @WebServlet(name = "FirstServlert",urlPatterns = "/firstServlet")
    等价于上面的配置
3.编写启动类
    第一种方式
        @ServletComponentScan在SpringBoot启动时会自动扫描@WebServlet注解，并将该类实例化
    第二种方式
        不需要添加@ServletComponentScan和@WebServlet注解，
        在启动类里添加方法返回值必须是ServletRegistrationBean,并添加注解@Bean注解
        