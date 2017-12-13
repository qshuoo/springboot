package com.qshuoo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qshuoo.dao.UserDao;
import com.qshuoo.pojo.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertUser(User user) {
		String sql = "insert into user (username, password) values (?, ?)";
		int rows = jdbcTemplate.update(sql, user.getUsername(), user.getPassword());
		return rows;
	}

	@Override
	public int deleteUser(Integer id) {
		String sql = "DELETE FROM user WHERE id = ?";
		int rows = jdbcTemplate.update(sql, id);
		return rows;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE user SET username = ?, password = ? WHERE id = ? ";
		int rows = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getId());
		
		return rows;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user WHERE id = ?";
		List<User> users = jdbcTemplate.query(sql, new Object[] {id}, new BeanPropertyRowMapper<User>(User.class));
		
		if (null != users && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
