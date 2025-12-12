package com.demo.SpringRestWebService.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringRestWebService.beans.Employee;
import com.demo.SpringRestWebService.dao.EmpoyeeDao;
import com.demo.SpringRestWebService.dto.EmployeeDTO;
import com.demo.SpringRestWebService.mapper.EmployeeDTOMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmpoyeeDao edao;

	@Override
	public List<EmployeeDTO> findAllEmp() {
		List<Employee> elist = edao.findAll();
		List<EmployeeDTO> edlist = elist.stream().map(emp -> EmployeeDTOMapper.EmpToEmpDTO(emp)).toList();
		return edlist;
	}

	@Override
	public EmployeeDTO findById(int id) {
		Optional<Employee> e = edao.findById(id);
		if (e.isPresent()) {
			EmployeeDTO ed = EmployeeDTOMapper.EmpToEmpDTO(e.get());
			return ed;
		}

		return null;
	}

	@Override
	public Employee addNewEmp(EmployeeDTO ed) {
		Employee e = EmployeeDTOMapper.EmpDTOToEmp(ed);
		return edao.save(e);
	}

	@Override
	public Employee modifyById(int id, EmployeeDTO ed) {
		Employee e = EmployeeDTOMapper.EmpDTOToEmp(ed);
		Optional<Employee>e1 = edao.findById(id);
		if(e1.isPresent()) {
			
			e.setId(ed.getId());
			e.setName(ed.getName());
			e.setSal(ed.getSal());
			e.setDept(ed.getDept());
			e.setDoj(LocalDate.parse(ed.getDoj(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			edao.save(e);
		}
		return null;
	}

	@Override
	public void deleteById(int id) {
		   edao.deleteById(id);
		
		
	}
}
