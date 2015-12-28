package com.jacket.astime.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jacket.astime.dao.UserMapper;
import com.jacket.astime.model.User;
import com.jacket.astime.service.UserService;
import com.jacket.astime.util.EncryptUtils;

@Service("userService")
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public User getUserFromLogin(String userName, String password) {
		User u = new User();
		u.setUserName(userName);
		u.setUserPassword(password);
		return userMapper.selectUserFromLogin(u);
	}

	@Override
	public User setUserFromRegister(User user) {
		return null;
	}

	@Override
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
