package com.demo.SpringBootWebServiceRest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.demo.SpringBootRestWebservice.mapper.ProductDtoMapper;
import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dao.SubjectDao;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;
import com.demo.SpringBootWebServiceRest.mapper.SubjectDtoMapper;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectDao sdao;

	@Override
	public List<SubjectDto> findAllSubject() {
		List<Subject> slist = sdao.findAll();
		List<SubjectDto> sdto = slist.stream().map(sub->SubjectDtoMapper.mapToSubjectDto(sub)).collect(Collectors.toList());
		return sdto;
	}

	

}
