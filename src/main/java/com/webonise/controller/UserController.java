package com.webonise.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.webonise.entity.User;
import com.webonise.service.UserServiceInterface;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserServiceInterface userService;

	@GetMapping("/")
	public String loginPage(Model model) {
		logger.info("UserController.loginPage()");
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user, Model model) {
		boolean valid = userService.validateUser(user);
		if (valid) {
			model.addAttribute("message", "Your login successful.");
			model.addAttribute("name", user.getUsername());
			logger.info("Your login successful");
			return "welcome";
		}
		model.addAttribute("message", "Your username and password is invalid.");
		logger.error("UserController.login()");
		return "login";
	}

	@GetMapping("/registration")
	public String userRegistration(Model model) {
		logger.info("UserController.userRegistration()");
		model.addAttribute("user", new User());
		return "registration";
	}

	@GetMapping("/logout")
	public String logOut(Model model) {
		logger.info("UserController.logOut()");
		model.addAttribute("user", new User());
		model.addAttribute("message", "You have been logged out successfully.");
		return "login";
	}

	@PostMapping("/registre")
	public String registration(@ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		logger.info("UserController.registration()");
		boolean userExist = userService.findByUsername(user.getUsername());
		if (userExist) {
			model.addAttribute("message", "User already exist, Please choose another username");
			logger.error("User already exist");
			return "registration";
		}
		userService.registerUser(user);
		model.addAttribute("message", "User successfully registred");
		model.addAttribute("name", user.getUsername());
		return "welcome";
	}

}
