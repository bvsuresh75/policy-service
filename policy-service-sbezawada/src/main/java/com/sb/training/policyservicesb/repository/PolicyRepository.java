package com.sb.training.policyservicesb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sb.training.policyservicesb.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy,String> {

}
