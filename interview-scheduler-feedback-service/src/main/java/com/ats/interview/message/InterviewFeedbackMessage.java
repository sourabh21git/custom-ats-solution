package com.ats.interview.message;

import java.io.Serializable;
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
public class InterviewFeedbackMessage implements Serializable{
	
	private static final long serialVersionUID = -2784143824210517632L;

	private Long candidateId;
	
	private UUID jobOpeningId;
	
	private String candidateEmail;
	
	private String candidateContactNumber;
	
	private String interviewScheduledBy;
	
	private Date interviewDate;
	
	private String interviewer;
	
	private String feedback;
	
	private Date createdDate;
	
	private String createdBy;
}
