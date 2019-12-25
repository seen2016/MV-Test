package com.mvc.mmall.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/12/25.
 */
@Controller
@RequestMapping("/users/")
public class UserController {
    @RequestMapping("userInfo")
    @ResponseBody
    public String getUserInfo() {

        return "用户信息";
    }
}
