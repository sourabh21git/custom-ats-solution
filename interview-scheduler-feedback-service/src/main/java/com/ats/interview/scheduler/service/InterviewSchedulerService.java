package com.ats.interview.scheduler.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.interview.message.InterviewScheduleMessage;
import com.ats.interview.queue.common.InterviewManagementMessageQueue;

@Service
public class InterviewSchedulerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void scheduleInterview(InterviewScheduleMessage interviewScheduleMessage) {
		rabbitTemplate.convertAndSend(InterviewManagementMessageQueue.INTERVIEW_SCHEDULE_NOTIFICATION.getExchange(),
				InterviewManagementMessageQueue.INTERVIEW_SCHEDULE_NOTIFICATION.getKey(), interviewScheduleMessage);
	}

}
