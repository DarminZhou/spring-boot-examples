package com.zhoudm.dao;

import com.zhoudm.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/7/21.
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    public UserInfo findByUsername(String username);
}
