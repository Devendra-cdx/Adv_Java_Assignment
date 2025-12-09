package com.demo.SpringBootWebServiceRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootWebServiceRest.dto.SubjectDto;
import com.demo.SpringBootWebServiceRest.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	SubjectService sservice;
	
	@GetMapping("/subject")
	public ResponseEntity<List<SubjectDto>> getAllSubject(){
		List<SubjectDto> slist = sservice.findAllSubject();
		return ResponseEntity.ok(slist);
	}

}
