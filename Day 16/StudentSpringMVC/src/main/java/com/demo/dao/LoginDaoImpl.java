package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.controller.Student;

@Repository

public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Student verifyUser(String username, String password) {

		try {
			Student stu = jdbcTemplate.queryForObject("select * from student22 where sname = ? and password = ? ",
					new Object[] { username, password }, BeanPropertyRowMapper.newInstance(Student.class));
			return stu;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
