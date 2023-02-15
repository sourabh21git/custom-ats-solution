package com.ats.openingmanagement.api;

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
import org.springframework.web.bind.annotation.RestController;

import com.ats.openingmanagement.model.Workflow;
import com.ats.openingmanagement.service.WorkflowService;

@RestController
public class WorkflowController {

	@Autowired
	private WorkflowService workflowService;

	@PostMapping(path = "workflow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Workflow> create(@RequestBody Workflow workflow) {
		return new ResponseEntity<>(workflowService.create(workflow), HttpStatus.OK);
	}

	@GetMapping("/workflow/{id}")
	public Workflow findWorkflow(@PathVariable UUID id) {
		return workflowService.getEntity(id);
	}

	@PutMapping(path = "workflow", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Workflow> update(@RequestBody Workflow workflow) {
		return new ResponseEntity<>(workflowService.update(workflow), HttpStatus.OK);
	}

	@DeleteMapping("/workflow/{id}")
	public void dleteJobOpening(@PathVariable UUID id) {
		workflowService.delete(id);
	}

}
