package com.services;

import java.util.List;

import com.entities.Users;

public interface UserServices {
	public List<Users> list();
	
	public boolean delete(Users user);
	public boolean saveOrUpdate(Users user);
}
