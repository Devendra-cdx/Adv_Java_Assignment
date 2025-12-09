package com.demo.service;

import java.util.List;

import com.demo.beans.Subject;

public interface SubjectService {

	List<Subject> findAllSubject();

	boolean addNewSub(Subject s);

	boolean deleteSub(int sid);

	Subject getById(int sid);

	boolean editSubject(Subject s);

}
