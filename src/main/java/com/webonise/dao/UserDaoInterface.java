package com.webonise.dao;

import java.util.List;

import com.webonise.entity.User;

public interface UserDaoInterface {

	void registerUser(User user);

	boolean findByUsername(String username);

	List<User> getAllUsers();

}