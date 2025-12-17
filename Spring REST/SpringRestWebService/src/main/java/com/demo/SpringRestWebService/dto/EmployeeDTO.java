package com.demo.SpringRestWebService.dto;

public class EmployeeDTO {

	private int id;
	private String name;
	private double sal;
	private String dept;
	private String doj;

	public EmployeeDTO(int id, String name, double sal, String dept, String doj) {
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

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + ", doj=" + doj + "]";
	}

}
