package com.jacket.gym.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jacket.astime.model.User;
import com.jacket.astime.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class UserTest {
	
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void test(){
		User user = userService.getUserById(2);
		System.out.println(JSON.toJSONString(user));
	}
	@Test
	public void test1(){
		User login = userService.getUserFromLogin("admin","123456789");
		System.out.println(JSON.toJSONString(login));
	}
}
