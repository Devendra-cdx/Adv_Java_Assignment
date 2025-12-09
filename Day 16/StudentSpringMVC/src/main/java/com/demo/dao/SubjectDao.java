package com.demo.dao;

import java.util.List;

import com.demo.beans.Subject;

public interface SubjectDao {

	List<Subject> displaySubject();

	boolean insertNewSub(Subject s);

	boolean deletbyId(int sid);

	Subject findById(int sid);

	boolean modifySub(Subject s);

}
