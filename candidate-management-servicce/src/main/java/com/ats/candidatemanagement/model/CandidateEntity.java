package com.ats.candidatemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "candidate")
public class CandidateEntity extends BaseAuditableDeleteableEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private int age;
	private int totalExperience;
	private int relevantExperience;
	private String skills;
	private String location;
	private String currentOrganization;
	private String designation;
	private Double currentCTC;
	private Double expectedCTC;

}
