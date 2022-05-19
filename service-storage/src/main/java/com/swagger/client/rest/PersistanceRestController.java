package com.swagger.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.client.service.PersistanceService;

import io.swagger.client.model.MobileAccessPostRequest;


@RestController
@RequestMapping("/api/v1/persistance")
public class PersistanceRestController {

	@Autowired
	private PersistanceService persistanceService;
	
	@PostMapping("/pstore")
	public ResponseEntity persistData(@RequestBody MobileAccessPostRequest mobileAccessPostRequest) {
		ResponseEntity<MobileAccessPostRequest> responseEntity=null; 
		MobileAccessPostRequest storesRestData=null;
		
		if(null!=mobileAccessPostRequest)
		 storesRestData = persistanceService.storesRestData(mobileAccessPostRequest);
		
		if(storesRestData!=null) {
			responseEntity=new ResponseEntity<>(storesRestData,HttpStatus.CREATED);
			
		}
		return responseEntity;
	}
     
}
