package com.hibernet.placement.service;

import com.hibernet.placement.dao.UserDAO;
import com.hibernet.placement.dao.UserDAOImpl;
import com.hibernet.placement.entitise.User;

public class UserServicesImpl  implements UserServices {
	private UserDAO dao;
	
	public  UserServicesImpl() {
		dao = new UserDAOImpl();
	}

	@Override
	public User findByUserId(long UserId) {
		// TODO Auto-generated method stub
		User user = dao.getUserById(UserId);
		return user;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeUser(user);
		dao.commitTransaction();
	}
}
