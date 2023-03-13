package com.xiaoma.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author 小马
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 7789323018804885241L;

    private String userAccount;

    private String userPassword;


}
