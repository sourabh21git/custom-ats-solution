package com.ats.candidatemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class BaseAuditableDeleteableEntity store audit and delete information for {@link Entity}.
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseAuditableDeleteableEntity extends BaseAuditableEntity {
 
	@Column(name="deleted")
	private Boolean deleted;
}