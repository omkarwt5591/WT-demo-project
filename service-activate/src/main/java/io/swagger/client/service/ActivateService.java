package io.swagger.client.service;

import org.springframework.http.ResponseEntity;

import com.swagger.client.api.MobileAccessApi;

import io.swagger.client.model.MobileAccessPostRequest;

public interface ActivateService {

	public ResponseEntity<MobileAccessPostRequest> invokeRestData(MobileAccessPostRequest mobileAccessPostRequest);
}
