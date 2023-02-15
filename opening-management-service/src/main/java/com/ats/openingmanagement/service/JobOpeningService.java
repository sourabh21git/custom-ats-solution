package com.ats.openingmanagement.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.openingmanagement.model.JobOpening;
import com.ats.openingmanagement.repository.JobDetailRepository;
import com.ats.openingmanagement.search.SearchCriteria;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JobOpeningService {

	@Autowired
	private JobDetailRepository jobDetailRepository;

	public List<JobOpening> findAll() {
		return jobDetailRepository.findAll();
	}

	public JobOpening create(JobOpening jobDetail) {
		log.info("Opening create request " + jobDetail);
		jobDetail.setId(UUID.randomUUID());
		return jobDetailRepository.save(jobDetail);
	}

	public JobOpening getEntity(UUID id) {
		return jobDetailRepository.findById(id).get();
	}

	public JobOpening update(JobOpening jobDetail) {
		log.info("Opening update request " + jobDetail);
		return jobDetailRepository.save(jobDetail);
	}

	public void delete(UUID id) {
		log.info("Opening delete request " + id);
		jobDetailRepository.deleteById(id);
	}
	
	
	public List<JobOpening> search(List<SearchCriteria> searchCriteriaList) {
		//TODOs: find by search criteria
		return jobDetailRepository.findAll();
	}

}
