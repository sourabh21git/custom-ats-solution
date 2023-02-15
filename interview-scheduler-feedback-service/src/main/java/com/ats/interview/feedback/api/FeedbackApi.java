package com.ats.interview.feedback.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ats.interview.feedback.service.FeedbackService;
import com.ats.interview.message.InterviewFeedbackMessage;

@RestController
public class FeedbackApi {
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping(path = "interview/feedback", produces = MediaType.APPLICATION_JSON_VALUE)
	public void scheduleInterview(@RequestBody InterviewFeedbackMessage message) {
		feedbackService.sendInterviewFeedback(message);
	}
}
