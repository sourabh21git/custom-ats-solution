package com.ats.interview.scheduler.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ats.interview.message.InterviewScheduleMessage;
import com.ats.interview.scheduler.service.InterviewSchedulerService;

@RestController
public class InterviewSchedulerApi {
	@Autowired
	private InterviewSchedulerService interviewSchedulerService;

	@PostMapping(path = "interview/schedule", produces = MediaType.APPLICATION_JSON_VALUE)
	public void scheduleInterview(@RequestBody InterviewScheduleMessage message) {
		interviewSchedulerService.scheduleInterview(message);
	}
}
