1.创建spring boot-jsp项目
2.pom文件导入web坐标，其次导入jstl、jasper坐标
3.创建全局配置文件application.properties
    #视图解析
    spring.mvc.view.prefix=/WEB-INF/jsp/
    spring.mvc.view.suffix=.jsp
4.创建controller
    通过model传输对象到指定的页面
5、建立webapp路径，将其设定为web根路径，创建jsp页面
    导入jstl标签库
    注：将webapp设置成/路径，将项目的Working directory：$MODULE_DIR$设置，避免访问不到jsp页面
6、创建启动类
