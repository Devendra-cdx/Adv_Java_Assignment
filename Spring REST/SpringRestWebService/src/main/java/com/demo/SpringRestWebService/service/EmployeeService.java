package com.demo.SpringRestWebService.service;

import java.util.List;

import com.demo.SpringRestWebService.beans.Employee;
import com.demo.SpringRestWebService.dto.EmployeeDTO;

public interface EmployeeService {

	List<EmployeeDTO> findAllEmp();

	EmployeeDTO findById(int id);

	Employee addNewEmp(EmployeeDTO e);

	Employee modifyById(int id, EmployeeDTO e);

	void deleteById(int id);

}
