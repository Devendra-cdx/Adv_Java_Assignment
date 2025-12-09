package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Subject;
import com.demo.dao.SubjectDao;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectDao sdao;

	public List<Subject> findAllSubject() {
		return sdao.displaySubject();
	}

	public boolean addNewSub(Subject s) {
		return sdao.insertNewSub(s);
	}

	public boolean deleteSub(int sid) {
		return sdao.deletbyId(sid);
	}

	public Subject getById(int sid) {
		return sdao.findById(sid);
	}

	public boolean editSubject(Subject s) {
		return sdao.modifySub(s);
	}
}
