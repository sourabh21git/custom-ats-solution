package com.ats.openingmanagement.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ats.openingmanagement.model.JobOpening;
import com.ats.openingmanagement.search.SearchCriteria;
import com.ats.openingmanagement.service.JobOpeningService;

@RestController
public class JobOpeningController {

	@Autowired
	private JobOpeningService jobService;

	@GetMapping(path = "jobopenings", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<JobOpening> getAllOpenings() {
		return jobService.findAll();
	}

	@PostMapping(path = "jobopenings", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JobOpening> create(@RequestBody JobOpening jobDetail) {
		return new ResponseEntity<>(jobService.create(jobDetail), HttpStatus.OK);
	}

	@GetMapping("/jobopenings/{id}")
	public JobOpening findJobOpening(@PathVariable UUID id) {
		return jobService.getEntity(id);
	}

	@PutMapping(path = "jobopenings", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JobOpening> update(@RequestBody JobOpening jobDetail) {
		return new ResponseEntity<>(jobService.update(jobDetail), HttpStatus.OK);
	}

	@DeleteMapping("/jobopenings/{id}")
	public void dleteJobOpening(@PathVariable UUID id) {
		jobService.delete(id);
	}
	
	@GetMapping(path = "jobopenings/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<JobOpening> search(@RequestParam String searchQuery) {
		List<SearchCriteria> criterias = null; //build search criteria from query string
		return jobService.search(criterias);
	}

}
