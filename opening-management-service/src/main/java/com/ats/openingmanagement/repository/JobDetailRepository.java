package com.ats.openingmanagement.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ats.openingmanagement.model.JobOpening;

@Repository
public interface JobDetailRepository extends MongoRepository<JobOpening, UUID>{

}
