package com.demo.SpringRestWebService.beans;

public class Dept {
	private int id;
	private String name;
	private String add;
	public Dept() {
		super();
	}
	public Dept(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
