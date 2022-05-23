package com.hibernet.placement.service;

import com.hibernet.placement.entitise.User;

public interface UserServices {
	User findByUserId(long UserId);
	void addUser(User user);
	void updateUser(User user);
	void removeUser(User user);

}
