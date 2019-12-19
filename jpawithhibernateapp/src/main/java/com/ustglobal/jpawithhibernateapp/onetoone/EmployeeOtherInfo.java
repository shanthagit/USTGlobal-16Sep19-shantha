package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeOtherInfo")
public class EmployeeOtherInfo {
	@Id
	@Column
	private int eid;
	@Column
	private String fname;
	@Column
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private EmployeeInfo info;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeInfo getInfo() {
		return info;
	}
	public void setInfo(EmployeeInfo info) {
		this.info = info;
	}
	


}
