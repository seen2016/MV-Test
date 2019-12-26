package com.mvc.mmall.services;

import com.mvc.mmall.pojo.UserInfo;

import java.util.Map;

/**
 * Created by Administrator on 2019/12/26.
 */
public interface UserInfoService {
    Map<String,UserInfo> getUserInfo();
    UserInfo getUserInfoByName(String uname);
    boolean delUserInfoByName(String uname);
    boolean delUserInfo(UserInfo userInfo);
    boolean addUserInfo(UserInfo userInfo);
}
