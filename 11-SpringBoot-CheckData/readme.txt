1、主要编写spring boot对表单数据的校验

2、添加用户，对用户输入的数据做校验

    springboot对表单数据校验的技术特点：{

        采用了Hibernate-validate校验框架（默认已经整合到了springboot-web包内）

        表单校验步骤：
            在实体类中添加校验规则：@NotBlank
            在controller中方法添加：@Valid 通过BindingResult对象对校验结果处理,在页面使用th:errors=@{}处理
            (有异常具体看addUser.html和UsersController.showpage方法，解决办法添加@ModelAttributeI()注解)
    }

    校验注解：@NotBlank判断字符串是否为nill或者是空串（去首尾空格）
             @NotEmpty判断字符串是否为nill或者是空串
             @Length判断字符串的长度（包含最大最小错误信息）
             @Min判断数值最小值
             @Max判断数值最大值
             @Email判断邮箱是否合法