package com.hibernet.placement.dao;

import com.hibernet.placement.entitise.User;

public interface UserDAO {
	User getUserById(long userId);
	void addUser(User user);
	void removeUser(User user);
	void updateUser(User user);
	void commitTransaction();
	void beginTransaction();


}
