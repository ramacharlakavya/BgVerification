package com.cg.backgroundverification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.dto.VerificationDto;
import com.cg.backgroundverification.service.BcgService;

@RestController
@RequestMapping("/BackGroundVerification")
@CrossOrigin("http://localhost:4200")
public class BackgroundVerificationController
{
  
	@Autowired
	BcgService bcgservice;
	
	@PostMapping(value="/SetStatus")
	public ResponseEntity<String> setStatus(@RequestBody VerificationDto verificationdto)
	{
		VerificationDto vdto=bcgservice.setStatus(verificationdto);
		if(vdto!=null)
		{
			return new ResponseEntity<String>("successfull",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("unsuccessfull",HttpStatus.OK);
		}
	
}
}
