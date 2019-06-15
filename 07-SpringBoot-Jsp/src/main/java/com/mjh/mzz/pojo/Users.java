package com.mjh.mzz.pojo;

/**
 * spring-boot
 * Author mzz
 * Create Date 2019/5/25 0025
 **/
public class Users {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Users() {
        super();
    }

    public Users(Integer userid, String username, Integer userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }
}
