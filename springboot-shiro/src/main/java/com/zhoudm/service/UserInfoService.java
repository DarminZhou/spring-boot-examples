package com.zhoudm.service;

import com.zhoudm.entity.UserInfo;

/**
 * Created by Administrator on 2017/7/21.
 */
public interface UserInfoService {
    public UserInfo findByUsername(String username);

}
