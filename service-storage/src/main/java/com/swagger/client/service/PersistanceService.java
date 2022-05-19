package com.swagger.client.service;

import org.springframework.http.ResponseEntity;

import io.swagger.client.model.MobileAccessPostRequest;

public interface PersistanceService {

	public MobileAccessPostRequest storesRestData(MobileAccessPostRequest mobileAccessPostRequest);
     
}
