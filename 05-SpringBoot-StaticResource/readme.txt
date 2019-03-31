## springboot访问静态资源的方式

1、在静态资源目录resources下（即classpath目录（即WEB-INF下面的classes目录））建立static(必须)的文件夹，把图片、文件....放到这里可以直接访问Http://localhost:8080/xxx.jpg,
    如果static下还有目录,那么访问的时候需要加上目录Http://localhost:8080/images/xxx.jpg
2、通过ServletContext根目录下访问,在src目录main下创建webapp（必须）的目录,这个目录作为静态资源的目录