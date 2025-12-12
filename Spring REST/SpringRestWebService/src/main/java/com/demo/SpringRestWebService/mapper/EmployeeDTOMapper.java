package com.demo.SpringRestWebService.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringRestWebService.beans.Employee;
import com.demo.SpringRestWebService.dto.EmployeeDTO;

public class EmployeeDTOMapper {

	public static EmployeeDTO EmpToEmpDTO(Employee e) {
		if (e.getDoj() == null) {
			return new EmployeeDTO(e.getId(), e.getName(), e.getSal(), e.getDept(), null);
		} else {
			return new EmployeeDTO(e.getId(), e.getName(), e.getSal(), e.getDept(),
					e.getDoj().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}

	}

	public static Employee EmpDTOToEmp(EmployeeDTO ed) {

		return new Employee(ed.getId(), ed.getName(), ed.getSal(), ed.getDept(),
				LocalDate.parse(ed.getDoj(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
