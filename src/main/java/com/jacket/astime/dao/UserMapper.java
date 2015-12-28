package com.jacket.astime.dao;

import com.jacket.astime.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectUserFromLogin(User user);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}