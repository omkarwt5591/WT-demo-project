package io.swagger.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.client.model.MobileAccessPostRequest;
import io.swagger.client.service.ActivateServiceImpl;


@RestController
@RequestMapping("/api/v1/activate")
public class ActivateController {

	@Autowired
	private ActivateServiceImpl activationService;
	
	
	@PostMapping("/access")
  public ResponseEntity storeData(@RequestBody io.swagger.client.model.MobileAccessPostRequest mobileAccessPostRequest) {
	  
    ResponseEntity responseEntity=null;
    
           MobileAccessPostRequest mobileAccesssPostRequest1=new MobileAccessPostRequest();
    
		   ResponseEntity<io.swagger.client.model.MobileAccessPostRequest> invokeRestData = activationService.invokeRestData(mobileAccessPostRequest);
		  
		  
		
	        return invokeRestData.ok(mobileAccesssPostRequest1);
    //  return null;
	}
	
}
