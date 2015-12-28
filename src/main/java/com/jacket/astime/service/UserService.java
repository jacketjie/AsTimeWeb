package com.jacket.astime.service;

import com.jacket.astime.model.User;

public interface UserService {

	User getUserById(Integer userId);

	User getUserFromLogin(String userName,String password);
	
	User setUserFromRegister(User user);
	
//	User getUserByUserName(String userName);
//	
//	User getUserByUserPhoneNumber(String userPhonenumber);
	
	Integer updateUser(User user);
	
//	Integer checkStatus(User user);
}
