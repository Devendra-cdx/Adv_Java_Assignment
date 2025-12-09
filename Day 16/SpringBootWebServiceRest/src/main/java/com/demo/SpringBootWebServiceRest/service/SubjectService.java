package com.demo.SpringBootWebServiceRest.service;

import java.util.List;

import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;

public interface SubjectService {

	List<SubjectDto> findAllSubject();

//	boolean addNewSub(Subject s);
//
//	boolean deleteSub(int sid);
//
//	Subject getById(int sid);
//
//	boolean editSubject(Subject s);

}
