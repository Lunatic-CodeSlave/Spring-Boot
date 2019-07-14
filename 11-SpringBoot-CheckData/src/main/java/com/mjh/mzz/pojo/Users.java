package com.mjh.mzz.pojo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * spring-boot 对表单数据的校验
 * Author mzz
 * Create Date 2019/7/14 0014
 **/
public class Users {
    private Integer id;
    @NotBlank//非空校验
    @Length(min = 2,max = 6,message = "2 <= name <= 6")
    private String name;
    @NotBlank
    private String password;
    @Min(value = 20)
    @Max(value = 30)
    private Integer age;
    @Email
    private String email;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
