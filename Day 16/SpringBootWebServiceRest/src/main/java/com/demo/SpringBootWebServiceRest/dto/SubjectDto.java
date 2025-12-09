package com.demo.SpringBootWebServiceRest.dto;

public class SubjectDto {

	private int sid;
	private String sName;
	private String duration;
	private String stdt;

	public SubjectDto() {
		super();
	}

	public SubjectDto(int sid, String sName, String duration, String stdt) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.duration = duration;
		this.stdt = stdt;
	}

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

	public String getStdt() {
		return stdt;
	}

	public void setStdt(String stdt) {
		this.stdt = stdt;
	}

	@Override
	public String toString() {
		return "SubjectDto [sid=" + sid + ", sName=" + sName + ", duration=" + duration + ", stdt=" + stdt + "]";
	}

}
