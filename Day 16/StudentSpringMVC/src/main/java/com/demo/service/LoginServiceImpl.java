package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.controller.Student;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao ldao;

	public Student varification(String username, String password) {		
		return ldao.verifyUser(username, password);
	}
	
}
