1、springboot中对异常处理的5种方式

      1.1 自定义错误页面
            {springboot默认处理异常的机制：一旦程序中出现了异常，它向/error的url发送请求，在spring boot中提供了一个
          叫BasicExceptionContoller来处理error请求，然后跳转默认显示异常的页面来提示异常。}

      1.2 @ExceptionHandler注解处理异常
           在controller里某个方法上添加@ExceptionHandler注解，属性value可以定义一个多个异常class对象，处理异常返回一个视图

      1.3 @ControllerAdvice + @ExceptionHandler注解处理异常
            创建一个处理全局异常类，在类上添加@ControllerAdvice注解

      1.4 配置SimpleMappingExtionResolver类完成异常处理
            创建一个处理全局异常类，在类上添加@Configuration注解，创建一个带有@bean注解的方法，该方法返回类型必须是SimpleMappingExceptionResolver ，
            通过Properties映射，key是异常类的全路径类名，value是视图页面
            缺点：不能传递异常信息

      1.5 自定义handlerExceptionResolver类处理异常
            创建一个处理全局异常类，在类上添加@Configuration注解，并实现HandlerExceptionResolver的方法resolveException，可以处理不同异常类型，并且
            能传递异常信息