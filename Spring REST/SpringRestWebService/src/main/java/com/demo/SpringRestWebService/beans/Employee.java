package com.demo.SpringRestWebService.beans;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private double sal;
	private String dept;
	private LocalDate doj;

	public Employee() {
		super();
	}

	public Employee(String name, double sal, String dept, LocalDate doj) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.doj = doj;
	}

	public Employee(int id, String name, double sal, String dept, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + ", doj=" + doj + "]";
	}

}
