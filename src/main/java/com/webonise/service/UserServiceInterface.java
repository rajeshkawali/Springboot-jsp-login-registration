package com.webonise.service;

import com.webonise.entity.User;

public interface UserServiceInterface {

	boolean findByUsername(String username);

	void registerUser(User user);

	boolean validateUser(User user);

	boolean validateConfirmPassword(User user);

}