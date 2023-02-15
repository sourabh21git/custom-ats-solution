package com.ats.interview.feedback.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.interview.message.InterviewFeedbackMessage;
import com.ats.interview.queue.common.InterviewManagementMessageQueue;

@Service
public class FeedbackService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendInterviewFeedback(InterviewFeedbackMessage message) {
		rabbitTemplate.convertAndSend(InterviewManagementMessageQueue.INTERVIEW_FEEDBACK_NOTIFICATION.getExchange(),
				InterviewManagementMessageQueue.INTERVIEW_FEEDBACK_NOTIFICATION.getKey(), message);
	}

}
