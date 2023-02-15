package com.ats.candidatemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ats.candidatemanagement.model.CandidateEntity;
@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long>{

}
