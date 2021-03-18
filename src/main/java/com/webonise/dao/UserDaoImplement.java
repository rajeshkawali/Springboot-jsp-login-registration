package com.webonise.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webonise.entity.User;

@Repository
public class UserDaoImplement implements UserDaoInterface {

	private static List<User> users = new ArrayList<User>();
	private static int userCount = 3;
	static {
		users.add(new User(1, "admin", "admin", "admin"));
		users.add(new User(2, "rajesh", "rajesh", "rajesh"));
		users.add(new User(3, "mahesh", "xyzxyzxyz", "xyzxyzxyz"));
		users.add(new User(4, "kiran", "kiranpassword", "kiranpassword"));
	}

	@Override
	public void registerUser(User user) {
		users.add(new User(userCount++, user.getUsername(), user.getPassword(), user.getConfirmPassword()));
	}

	@Override
	public boolean findByUsername(String username) {
		boolean flag = false;
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}
}
