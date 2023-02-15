package com.ats.candidatemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.candidatemanagement.model.CandidateEntity;
import com.ats.candidatemanagement.repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	public List<CandidateEntity> findAll() {
		return candidateRepository.findAll();
	}

	public CandidateEntity create(CandidateEntity candidateEntity) {
		return candidateRepository.save(candidateEntity);
	}

	public CandidateEntity getEntity(Long id) {
		return candidateRepository.findById(id).get();
	}

	public CandidateEntity update(CandidateEntity candidateEntity) {
		return candidateRepository.save(candidateEntity);
	}

	public void delete(Long id) {
		candidateRepository.deleteById(id);
	}

}
