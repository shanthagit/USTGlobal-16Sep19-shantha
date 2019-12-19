package com.ustglobal.jpawithhibernateapp.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Experience")
public class Experience {
	@Id
	@Column
	private int expid;
	@Column
	private String compnayName;
	@Column
	private int year;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id" , nullable=false)
	private EmployeeInfo1 info;

}









































