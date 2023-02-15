package com.ats.candidatemanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class BaseAuditableEntity store audit information for {@link Entity}.
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseAuditableEntity {
	@CreatedDate
	@Column(updatable = false, name = "createddate")
	private Date createdDate;

	@LastModifiedDate
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;

	@CreatedBy
	@Column(updatable = false, name = "createdby")
	private String createdBy;

	@LastModifiedBy
	@Column(name = "lastmodifiedby")
	private String lastModifiedBy;

	public Date getCreatedDate() {
		return this.createdDate == null ? null : new Date(this.createdDate.getTime());
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate == null ? null : new Date(this.lastModifiedDate.getTime());
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate == null ? null : new Date(createdDate.getTime());
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate == null ? null : new Date(lastModifiedDate.getTime());
	}
	
}