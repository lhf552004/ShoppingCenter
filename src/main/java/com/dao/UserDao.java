package com.dao;

import java.util.List;

import com.entities.Users;

public interface UserDao {
	public List<Users> list();
	
	public boolean delete(Users user);
	public boolean saveOrUpdate(Users user);
}
