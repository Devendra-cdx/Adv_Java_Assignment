package com.demo.SpringRestWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringRestWebService.beans.Employee;

public interface EmpoyeeDao extends JpaRepository<Employee, Integer> {

}
