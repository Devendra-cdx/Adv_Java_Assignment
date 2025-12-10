package com.demo.SpringBootWebServiceRest.service;

import java.util.List;

import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;

public interface SubjectService {

	List<SubjectDto> findAllSubject();

	SubjectDto getBySubId(int sid);

	void addNewSubject(SubjectDto s);

	void deleteSubject(int s);

	void modifySubject(SubjectDto sid);

}
