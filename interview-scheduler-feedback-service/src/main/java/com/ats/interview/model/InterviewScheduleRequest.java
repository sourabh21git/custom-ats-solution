package com.ats.interview.model;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class InterviewScheduleRequest {
	
	private Date interviewScheduledDate;
	
	private Long candidateId;
	
	private UUID jobOpeningId;
	
	private String candidateEmail;
	
	private String candidateContactNumber;
	
	private String interviewScheduledBy;
	
	private Date createdDate;
	
	private String createdBy;

}
