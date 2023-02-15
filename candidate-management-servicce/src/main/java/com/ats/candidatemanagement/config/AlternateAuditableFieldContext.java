package com.ats.candidatemanagement.config;

public class AlternateAuditableFieldContext {

    private AlternateAuditableFieldContext() {
    }

    private static ThreadLocal<AtsAuditingFields> alternateAuditableDataThreadLocal = new ThreadLocal<AtsAuditingFields>() {

        @Override
        protected AtsAuditingFields initialValue() {
            return new AtsAuditingFields();
        }
    };

    public static AtsAuditingFields getAlternateAuditableFieldData() {
        return alternateAuditableDataThreadLocal.get();
    }

    public static void setAlternateAuditableFieldData(AtsAuditingFields prgxAuditingFields) {
        alternateAuditableDataThreadLocal.set(prgxAuditingFields);
    }

    public static void clearContext() {
        alternateAuditableDataThreadLocal.remove();
    }

}
