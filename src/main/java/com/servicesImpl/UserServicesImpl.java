package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	UserDao userDao;
	public List<Users> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	public boolean delete(Users user) {
		// TODO Auto-generated method stub
		return userDao.delete(user);
	}

	public boolean saveOrUpdate(Users user) {
		// TODO Auto-generated method stub
		return userDao.saveOrUpdate(user);
	}

}
