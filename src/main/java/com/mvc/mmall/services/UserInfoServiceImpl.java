package com.mvc.mmall.services;

import com.mvc.mmall.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private Map<String,UserInfo> userInfoMap;

    public UserInfoServiceImpl() {
        if (null==userInfoMap)
        {
            userInfoMap=new HashMap<>();
        }
    }

    @Override
    public Map<String,UserInfo> getUserInfo() {
        if (userInfoMap.isEmpty())
        {
            return null;
        }
        return userInfoMap;
    }

    @Override
    public UserInfo getUserInfoByName(String uname) {
        if (userInfoMap.isEmpty()){
            return null;
        }
        UserInfo userInfo = this.userInfoMap.get(uname);
        if (null==userInfo){
            return null;
        }
        return userInfo;
    }

    @Override
    public boolean delUserInfoByName(String uname) {
        if (userInfoMap.isEmpty()){
            return false;
        }
        UserInfo remove = userInfoMap.remove(uname);
        return remove==null?false:true;
    }

    @Override
    public boolean delUserInfo(UserInfo userInfo) {
        if (userInfoMap.isEmpty()){
            return false;
        }
        UserInfo remove = userInfoMap.remove(userInfo);
        return remove==null?false:true;
    }

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        if (userInfo==null)
        {
            return false;
        }
        UserInfo put = userInfoMap.put(userInfo.getUserName(), userInfo);
        return put==null?false:true;
    }
}
