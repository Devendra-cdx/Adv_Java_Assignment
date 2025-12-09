package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Subject {

	private int sid;
	private String sName;
	private String duration;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate stdt;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LocalDate getStdt() {
		return stdt;
	}

	public void setStdt(LocalDate stdt) {
		this.stdt = stdt;
	}

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", sName=" + sName + ", duration=" + duration + ", stdt=" + stdt + "]";
	}

}
