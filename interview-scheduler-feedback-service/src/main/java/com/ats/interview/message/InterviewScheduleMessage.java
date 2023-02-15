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
public class InterviewScheduleMessage implements Serializable{
	
	private static final long serialVersionUID = 8120963583235171053L;

	private Date interviewScheduledDate;
	
	private Long candidateId;
	
	private UUID jobOpeningId;
	
	private String candidateEmail;
	
	private String candidateContactNumber;
	
	private String interviewScheduledBy;
	
	private Date createdDate;
	
	private String createdBy;

}
