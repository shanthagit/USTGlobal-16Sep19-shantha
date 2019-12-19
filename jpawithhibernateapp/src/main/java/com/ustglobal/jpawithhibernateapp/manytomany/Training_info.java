package com.ustglobal.jpawithhibernateapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="training_info")
public class Training_info {
	@Id
	@Column
	private int tid;
	@Column
	private String type;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Training",joinColumns =@JoinColumn(name="tid"),
	inverseJoinColumns = @JoinColumn(name="id"))
	private List<EmployeeInfo1> emp;
	

}
