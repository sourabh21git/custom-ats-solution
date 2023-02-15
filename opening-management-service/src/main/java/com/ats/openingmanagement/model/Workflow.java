package com.ats.openingmanagement.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "ats_workflow")
public class Workflow {
	@Id
	private UUID id;
	
	private UUID jobOpeningId;
	
	private WorkflowStage stage;
	private WorkflowStatus status;
	private String assignedUser;
	private Date createdDate;
	private Date lastUpdatedDate;
	private String createdBy;
	private String lastUpdatedBy;
}
