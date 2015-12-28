package com.jacket.astime.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jacket.astime.model.User;
import com.jacket.astime.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("admin/login");
		return mav;
	}
//	public @ResponseBody
//	Object login(User user) {
//		User result = null;
//		try {
//			result = userService.getUserFromLogin(user.getUserName(),
//					user.getUserPassword());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Map<String, Object> map = new HashMap<String, Object>();
//		if (result != null) {
//			map.put("result", 1);
//			map.put("user", result);
//		} else {
//			map.put("result", -1);
//		}
//		return map;
//	}

	// /**
	// * 注册：
	// *
	// * @param user
	// * @return 返回result:1，注册成功；0，注册失败；-1,用户名已存在；-2，号码已注册；
	// * @throws Exception
	// */
	// @RequestMapping("/register")
	// public @ResponseBody
	// Object register(User user) throws Exception {
	// int result = -1;
	// User checkUser = null;
	// Map<String, Object> map = new HashMap<String, Object>();
	// checkUser = userService.getUserByUserName(user.getUserName());
	// if (checkUser != null) {
	// map.put("result", -1);
	// return map;
	// }
	// checkUser = userService.getUserByUserPhoneNumber(user
	// .getUserPhonenumber());
	// if (checkUser != null) {
	// map.put("result", -2);
	// return map;
	// }
	// checkUser = userService.setUserFromRegister(user);
	//
	// if (checkUser != null) {
	// checkUser = userService.getUserByUserName(user.getUserName());
	// map.put("result", 1);
	// map.put("user", checkUser);
	// } else {
	// map.put("result", 0);
	// }
	// return map;
	// }
	//
	// /**
	// * 更新用户资料
	// *
	// * @param user
	// * @param req
	// * @return 返回result:1，注册成功；-1，更新失败；0,用户不存在；-2,用户不能为空
	// */
	// @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	// public @ResponseBody
	// Object updateUser(User user, HttpServletRequest req) {
	// int result = -1, updateCount = -1;
	// String userIconPath = handerUpload(user, req);
	// User checkUser = null;
	// if (userIconPath != null) {
	// user.setUserIcon(userIconPath);
	// }
	// Map<String, Object> map = new HashMap<String, Object>();
	// if (user == null) {
	// map.put("result", -2);
	// return map;
	// }
	// checkUser = userService.getUserById(user.getUserId());
	// if (checkUser == null) {
	// map.put("result", 0);
	// return map;
	// }
	// updateCount = userService.updateUser(user);
	// if (updateCount == 1) {
	// checkUser = userService.getUserById(user.getUserId());
	// map.put("result", 1);
	// map.put("user", checkUser);
	// return map;
	// }
	// map.put("result", result);
	// return map;
	// }
	//
	// private String handerUpload(User user, HttpServletRequest req) {
	// String filePath = null;
	// if (user == null || user.getUserIcon() == null
	// || user.getUserIcon().equals("")) {
	// InputStream inputStream = null;
	// FileOutputStream fos = null;
	// try {
	// inputStream = req.getInputStream();
	// File dir = new File("Images/" + user.getUserId());
	// if (!dir.exists()) {
	// dir.mkdirs();
	// }
	// String fileName = user.getUserIcon();
	// File file = new File(dir, System.currentTimeMillis() + "_"
	// + fileName);
	// fos = new FileOutputStream(file);
	// int bytesRead = 0;
	// byte[] buffer = new byte[1024];
	// while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
	// fos.write(buffer, 0, bytesRead);
	// }
	// filePath = file.getAbsolutePath();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }finally{
	// try {
	// fos.close();
	// inputStream.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	// return filePath;
	// }
	//
	// @RequestMapping(value = "/checkStatus")
	// @ResponseBody
	// public Object checkStatus(User user) {
	// int result = -1;
	// Map<String, Object> map = new HashMap<String, Object>();
	// result = userService.checkStatus(user);
	// if (result == 1) {
	// map.put("result", 1);
	// } else {
	// map.put("result", -1);
	// }
	// return map;
	// }

}
