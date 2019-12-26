package com.mvc.mmall.pojo;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2019/12/26.
 */

public class UserInfo {
    @Size(min = 6,max = 20,message = "用户名必须是6-20")
    private String userName;
    private String address;
    private String email;
    private String mobile;

    public UserInfo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
