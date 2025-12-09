package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService lservice;

	@GetMapping("/loginUser")
	public String showLogin() {
		return "showLogin";
	}

	@PostMapping("/validateUser")
	public ModelAndView validation(HttpSession session, @RequestParam("uname") String username,
			@RequestParam("pwd") String password) {

		System.out.println("helloo");

		Student s = lservice.varification(username, password);

		System.out.println(s);

		if (s != null) {
			session.setAttribute("stu", s);
			return new ModelAndView("redirect:/subject/showSubject");
		}
		return new ModelAndView("showLogin", "message", "Invalid Credentials");
	}

}
