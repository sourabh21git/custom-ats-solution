package com.ats.openingmanagement.model;


import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "job_opening")
public class JobOpening {
	
	@Id
	private UUID id;
	
	private String role;
	private String jobDescription;
	private JobType jobType;
	private String location;
	private Integer startExperienceYears;
	private Integer endExperienceYears;
	private Double ctcStart;
	private Double ctcEnd;
	private String currencyCode;
	private String organizationCode;
	private Map<String, Object> attributes;

}
