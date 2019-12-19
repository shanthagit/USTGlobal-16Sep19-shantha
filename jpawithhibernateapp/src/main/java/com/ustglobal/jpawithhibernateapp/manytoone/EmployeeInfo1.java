
package com.ustglobal.jpawithhibernateapp.manytoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="EmployeeInfo")
public class EmployeeInfo1 {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	
	
	@Exclude
	@OneToMany(mappedBy = "info")
	private List<Experience> experience;

	

}
