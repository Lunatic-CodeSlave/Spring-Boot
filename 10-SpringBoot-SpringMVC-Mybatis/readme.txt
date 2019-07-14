springboot+springMVC+Mybatis

1、 简单实现一个对数据库对象users的curd的操作
    创建项目，修改pom文件:添加mybatis、mysql、连接池(druid)的坐标
    添加application.properties全局配置文件:配置数据库驱动、连接池、mybatis配置
    在mysql里创建user表

2、 创建实体类users类
    创建mapper接口以及映射配置文件(编译后映射配置文件如果不在target下，最好放在resource下面;在pom.xml里面配置得注意)
    创建业务层（用户的curd）
    创建Controller层
    创建页面
    创建启动类(@MapperScan 整合mybatis时，用于扫描Mapper接口（相当于在mapper接口添加@Mapper注解）)

3、 mysql中文乱码：
        设置数据库编码格式UTF-8;
        查看MySQL里character_set_server是否为utf8(SHOW VARIABLES LIKE 'char%';),在my.ini文件添加配置重启可生效