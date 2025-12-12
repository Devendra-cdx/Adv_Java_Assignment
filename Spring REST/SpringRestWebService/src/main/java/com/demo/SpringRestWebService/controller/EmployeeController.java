package com.demo.SpringRestWebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringRestWebService.beans.Employee;
import com.demo.SpringRestWebService.dto.EmployeeDTO;
import com.demo.SpringRestWebService.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService eservice;

	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getAll() {
		List<EmployeeDTO> edlist = eservice.findAllEmp();
		if (edlist != null) {
			return ResponseEntity.ok(edlist);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getById(@PathVariable int id) {
		EmployeeDTO ed = eservice.findById(id);
		if (ed != null) {
			return ResponseEntity.ok(ed);
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody EmployeeDTO e) {
		Employee emp = eservice.addNewEmp(e);
		return emp;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateById(@PathVariable int id, @RequestBody EmployeeDTO e) {
		Employee ed = eservice.modifyById(id, e);
		return ResponseEntity.ok(ed);
	}

	@DeleteMapping("/{id}")
	public String removeById(@PathVariable int id) {
		eservice.deleteById(id);
		return "Deleted Successfully";
	}

}
