package com.zhoudm.service.impl;

import com.zhoudm.dao.UserInfoDao;
import com.zhoudm.entity.UserInfo;
import com.zhoudm.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/21.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username){
    System.out.println("UserInfoServiceImpl.findByUsername()");
    return userInfoDao.findByUsername(username);
}

}
