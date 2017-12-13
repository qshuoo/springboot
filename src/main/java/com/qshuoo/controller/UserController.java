package com.qshuoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qshuoo.dao.UserDao;
import com.qshuoo.pojo.User;

/**
 * 用戶 控制
 * @author QIAOYONGSHUO
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/add")
	public String addUser(User user) {
		int res = userDao.insertUser(user);
		return "res : " + res;
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/delete/{id}")
	public String delUser(@PathVariable Integer id) {
		int res = userDao.deleteUser(id);
		return "res : " + res;
	}
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/update")
	public String updateUser(User user) {
		int res = userDao.updateUser(user);
		return "res : " + res;
	}
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/{id}")
	public User getUserById(@PathVariable Integer id) {
		User user = userDao.getUserById(id);
		return user;
	}
}
