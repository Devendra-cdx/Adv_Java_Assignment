package com.demo.beans;

import java.time.LocalDate;

public class Student {

	private int sid;
	private String sname;
	private String Address;
	private LocalDate dob;
	private LocalDate regdt;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getRegdt() {
		return regdt;
	}

	public void setRegdt(LocalDate regdt) {
		this.regdt = regdt;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", Address=" + Address + ", dob=" + dob + ", regdt=" + regdt
				+ ", password=" + password + "]";
	}

}
