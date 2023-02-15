package com.ats.candidatemanagement.config;

import java.util.Objects;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.ats.candidatemanagement.model.BaseAuditableEntity;



public class AtsAuditingEntityListener {

	@PrePersist
	public void touchForCreate(Object target) {
		overrideAuditingfields(target, true);
	}

	@PreUpdate
	public void touchForUpdate(Object target) {
		overrideAuditingfields(target, false);
	}

	/**
	 * Override the auditing fields
	 * 
	 * @param target
	 * @param isNew
	 */
	private void overrideAuditingfields(Object target, boolean isNew) {
		AtsAuditingFields auditingFields = AlternateAuditableFieldContext.getAlternateAuditableFieldData();
		if (target instanceof BaseAuditableEntity) {
			BaseAuditableEntity entity = (BaseAuditableEntity) target;
			if (Objects.nonNull(auditingFields.getCreatedBy()) && isNew) {
				entity.setCreatedBy(auditingFields.getCreatedBy());
			}
			if (Objects.nonNull(auditingFields.getCreatedDate()) && isNew) {
				entity.setCreatedDate(auditingFields.getCreatedDate());
			}
			if (Objects.nonNull(auditingFields.getLastModifiedBy())) {
				entity.setLastModifiedBy(auditingFields.getLastModifiedBy());
			}
			if (Objects.nonNull(auditingFields.getLastModifiedDate())) {
				entity.setLastModifiedDate(auditingFields.getLastModifiedDate());
			}
		}
	}
}
