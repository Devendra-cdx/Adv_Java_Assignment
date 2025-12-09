package com.demo.SpringBootWebServiceRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBootWebServiceRest.beans.Subject;

public interface SubjectDao extends JpaRepository<Subject, Integer> {

}
