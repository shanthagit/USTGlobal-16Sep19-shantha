package com.ustglobal.jpawithhibernateapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="Employee")
public class EmployeeInfo1 {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="emp")
	private List<Training_info> train;
	
	
	
	

	

}
