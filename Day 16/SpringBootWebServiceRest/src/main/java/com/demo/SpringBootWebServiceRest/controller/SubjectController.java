package com.demo.SpringBootWebServiceRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;
import com.demo.SpringBootWebServiceRest.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	SubjectService sservice;

	@GetMapping("/subject")
	public ResponseEntity<List<SubjectDto>> getAllSubject() {
		List<SubjectDto> slist = sservice.findAllSubject();
		return ResponseEntity.ok(slist);
	}

	@GetMapping("/subject/{sid}")
	public ResponseEntity<SubjectDto> getSubjectById(@PathVariable int sid) {
		SubjectDto s = sservice.getBySubId(sid);
		if (s != null)
			return ResponseEntity.ok(s);
		else
			return (ResponseEntity<SubjectDto>) ResponseEntity.notFound();
	}

	@PostMapping("/subject/{sid}")
	public ResponseEntity<Subject> addSubject(@RequestBody SubjectDto s) {
		sservice.addNewSubject(s);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@DeleteMapping("/subject/{sid}")
	public ResponseEntity<Subject> deleteSubject(@PathVariable int sid) {
		sservice.deleteSubject(sid);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
		
	@PutMapping("/subject/{sid}")
	public String updateSubject(@RequestBody SubjectDto s) {
		sservice.modifySubject(s);
		return "updated successfully";
	}
}
