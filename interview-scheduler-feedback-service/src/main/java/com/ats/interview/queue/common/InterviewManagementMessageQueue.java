package com.ats.interview.queue.common;

public enum InterviewManagementMessageQueue {

    INTERVIEW_SCHEDULE_NOTIFICATION("DEFAULT_ATS_EXCHANGE", "interview-schedule-queue", "interview-schedule-queue-RK"),
    INTERVIEW_FEEDBACK_NOTIFICATION("DEFAULT_ATS_EXCHANGE", "interview-feedback-queue", "interview-feedback-queue-RK");
	
	private final String exchange;
	private final String queue;
	private final String key;
	private final boolean requeable;

	InterviewManagementMessageQueue(String exchange, String queue, String key) {
		this(exchange, queue, key, true);
	}
	
	InterviewManagementMessageQueue(String exchange, String queue, String key, boolean requeable) {
        this.exchange = exchange;
        this.queue = queue;
        this.key = key;
        this.requeable = requeable;
    }

	public String getExchange() {
		return exchange;
	}

	public String getQueue() {
		return queue;
	}

	public String getKey() {
		return key;
	}
	
	public boolean isRequeable() {
        return requeable;
    }
}
