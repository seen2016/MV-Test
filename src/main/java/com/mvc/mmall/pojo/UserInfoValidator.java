package com.mvc.mmall.pojo;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2019/12/26.
 */
public class UserInfoValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return UserInfo.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"address","600","地址不能为空");
        ValidationUtils.rejectIfEmpty(errors,"userName","601","名字不能为空");
    }
}
