package io.swagger.client.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.swagger.client.model.MobileAccessPostRequest;

@Service
public class ActivateServiceImpl implements ActivateService {

	
	public ResponseEntity<MobileAccessPostRequest> invokeRestData(MobileAccessPostRequest mobileAccessPostRequest) {
		
		RestTemplate restTemplate=new RestTemplate();
		
		final String REST_ENDPOINT_URL="http://localhost:8085/api/v1/persistance/pstore";

		//MobileAccessPostRequest mobileAccessPostRequest1=new MobileAccessPostRequest();
		MobileAccessPostRequest mobileAccessApi=new MobileAccessPostRequest();	
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("Acceept","application/json");
		headers.add("Content-Type","application/json");
		
		HttpEntity<MobileAccessPostRequest> reqEntity=new HttpEntity<>(mobileAccessPostRequest,headers);
		//ResponseEntity<MobileAccessPostRequest> mobileAccessPostRequest1=
			
		         
		
//		ResponseEntity<MobileAccessApi> responseEntity = restTemplate.exchange(REST_ENDPOINT_URL, HttpMethod.POST, reqEntity,MobileAccessApi.class);
		         ResponseEntity<MobileAccessPostRequest> responseEntity = restTemplate.postForEntity(REST_ENDPOINT_URL, mobileAccessPostRequest, MobileAccessPostRequest.class);
		return responseEntity; 
	}
}
