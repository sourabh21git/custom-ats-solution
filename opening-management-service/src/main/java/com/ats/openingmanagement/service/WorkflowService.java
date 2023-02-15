package com.ats.openingmanagement.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.openingmanagement.model.Workflow;
import com.ats.openingmanagement.repository.WorkflowRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WorkflowService {

	@Autowired
	private WorkflowRepository workflowRepository;

	public List<Workflow> findAll() {
		return workflowRepository.findAll();
	}

	public Workflow create(Workflow workflow) {
		log.info("workflow create request " + workflow);
		workflow.setId(UUID.randomUUID());
		return workflowRepository.save(workflow);
	}

	public Workflow getEntity(UUID id) {
		return workflowRepository.findById(id).get();
	}

	public Workflow update(Workflow workflow) {
		log.info("workflow update request " + workflow);
		return workflowRepository.save(workflow);
		//TODOs send notification to assigned user
	}

	public void delete(UUID id) {
		log.info("workflow delete request " + id);
		workflowRepository.deleteById(id);
	}

}
