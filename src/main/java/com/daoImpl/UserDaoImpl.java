package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entities.Users;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory session;
	public List<Users> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Users").list();
	}
	
	public boolean delete(Users user) {
		// TODO Auto-generated method stub
		try {
			session.getCurrentSession().delete(user);
		}catch(Exception ex) {
			return false;
		}
		return true;
	}

	public boolean saveOrUpdate(Users user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(user);
		return true;
	}

}
