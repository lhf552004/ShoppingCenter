package com.dao;

import java.util.List;

import com.entities.Login;
import com.entities.User;

public interface UserDao {
	public List<User> list();
	
	public boolean delete(User user);
	public boolean saveOrUpdate(User user);
	
	void register(User user);
	User validateUser(Login login);
}
