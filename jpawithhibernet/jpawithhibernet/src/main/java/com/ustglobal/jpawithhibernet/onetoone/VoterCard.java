package com.ustglobal.jpawithhibernet.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="VoterCard")
public class VoterCard {
	@Id
	@Column
   private int vid;
	@Column
   private String vname;
    @Exclude
    @OneToOne(mappedBy="VoterCard")
   private Person person;
}
