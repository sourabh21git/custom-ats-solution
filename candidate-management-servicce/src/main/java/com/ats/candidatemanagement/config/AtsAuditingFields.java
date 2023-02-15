package com.ats.candidatemanagement.config;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtsAuditingFields {

    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;

    public Date getCreatedDate() {
        return this.createdDate == null ? null : new Date(this.createdDate.getTime());
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate == null ? null : new Date(createdDate.getTime());
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate == null ? null : new Date(this.lastModifiedDate.getTime());
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate == null ? null : new Date(lastModifiedDate.getTime());
    }
}
