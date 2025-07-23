package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	@RequestMapping("/submitForm")
	public String submit(@RequestParam String email, @RequestParam  String password, @RequestParam String username, @RequestParam String designation, Model m)
	{
		m.addAttribute("email",email);
		m.addAttribute("designation", designation);
		m.addAttribute("username", username);
		m.addAttribute("password", password);
		return "result";
	}
}
