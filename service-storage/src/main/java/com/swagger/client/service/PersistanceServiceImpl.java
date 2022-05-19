package com.swagger.client.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.swagger.client.repository.PersistanceRepository;

import io.swagger.client.model.MobileAccessPostRequest;

@Service
public class PersistanceServiceImpl implements PersistanceService {

	private PersistanceRepository persistanceRepository;

@Override
public MobileAccessPostRequest storesRestData(MobileAccessPostRequest mobileAccessPostRequest) {

	MobileAccessPostRequest mobileAccessPostRequest1=new MobileAccessPostRequest();
	MobileAccessPostRequest saveData;
	ResponseEntity<MobileAccessPostRequest> responseEntity;
	
	mobileAccessPostRequest1.setName(mobileAccessPostRequest.getName());
	mobileAccessPostRequest1.setDescription(mobileAccessPostRequest.getDescription());
	mobileAccessPostRequest1.setState(mobileAccessPostRequest.getState());
	mobileAccessPostRequest1.setServiceSpecification(mobileAccessPostRequest.getServiceSpecification());
	mobileAccessPostRequest1.setServiceCharacteristic(mobileAccessPostRequest.getServiceCharacteristic());
	mobileAccessPostRequest1.setServiceRelationship(mobileAccessPostRequest.getServiceRelationship());
	mobileAccessPostRequest1.setRelatedParty(mobileAccessPostRequest1.getRelatedParty());
	mobileAccessPostRequest1.setSupportingService(mobileAccessPostRequest.getSupportingService());
	
	 saveData = persistanceRepository.save(mobileAccessPostRequest1);
	 
	
	return saveData;
}


}
