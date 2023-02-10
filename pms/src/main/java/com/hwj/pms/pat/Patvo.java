package com.hwj.pms.pat;

public class Patvo {
	
	private String id,patname,patsex,patbirth;
	private Integer patage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatname() {
		return patname;
	}
	public void setPatname(String patname) {
		this.patname = patname;
	}
	public String getPatsex() {
		return patsex;
	}
	public void setPatsex(String patsex) {
		this.patsex = patsex;
	}
	public String getPatbirth() {
		return patbirth;
	}
	public void setPatbirth(String patbirth) {
		this.patbirth = patbirth;
	}
	public Integer getPatage() {
		return patage;
	}
	public void setPatage(Integer patage) {
		this.patage = patage;
	}
	
	@Override
	public String toString() {
		return "Patvo [id=" + id + ", patname=" + patname + ", patsex=" + patsex + ", patbirth=" + patbirth
				+ ", patage=" + patage + "]";
	}

	
	
}
