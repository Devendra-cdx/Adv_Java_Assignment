package com.demo.dao;

import com.demo.controller.Student;

public interface LoginDao {

	Student verifyUser(String username, String password);

}
