package com.swagger.client.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.client.model.MobileAccessPostRequest;

public interface PersistanceRepository extends MongoRepository<MobileAccessPostRequest,Serializable> {

	
}
