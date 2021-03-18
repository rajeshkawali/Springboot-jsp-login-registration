package com.webonise.entity;

public class User {

	private int id;
	// @NotEmpty(message = "Please enter Username.")
	private String username;
	// @NotEmpty(message = "Please enter Password.")
	// @Size(min = 4, max = 15, message = "Your password must be between {min} to
	// {max} characters")
	private String password;
	// @NotEmpty(message = "Please enter Confirm Password.")
	// @NotNull(message = "Please enter Confirm Password.")
	private String confirmPassword;

	public User() {

	}

	public User(int id, String username, String password, String confirmPassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
