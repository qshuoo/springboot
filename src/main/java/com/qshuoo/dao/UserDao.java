package com.qshuoo.dao;

import java.util.List;

import com.qshuoo.pojo.User;

/**
 * 用戶dao接口
 * @author QIAOYONGSHUO
 *
 */
public interface UserDao {

	/**
	 * 添加用戶
	 * @param user
	 * @return
	 */
	int insertUser(User user);
	
	/**
	 * 刪除用戶
	 * @param id
	 * @return
	 */
	int deleteUser(Integer id);
	
	/**
	 * 更新用戶
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
//	List<User> listUser();
	
}
