package com.ats.candidatemanagement.api;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.ats.candidatemanagement.model.CandidateEntity;
import com.ats.candidatemanagement.service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@GetMapping(path = "candidates", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CandidateEntity> getAllOpenings() {
		return candidateService.findAll();
	}

	@PostMapping(path = "candidates", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CandidateEntity> create(@RequestBody CandidateEntity candidate) {
		return new ResponseEntity<>(candidateService.create(candidate), HttpStatus.OK);
	}

	@GetMapping("/candidates/{id}")
	public CandidateEntity findJobOpening(@PathVariable Long id) {
		return candidateService.getEntity(id);
	}

	@PutMapping(path = "candidates", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CandidateEntity> update(@RequestBody CandidateEntity candidate) {
		return new ResponseEntity<>(candidateService.update(candidate), HttpStatus.OK);
	}

	@DeleteMapping("/candidates/{id}")
	public void dlete(@PathVariable Long id) {
		candidateService.delete(id);
	}

}
