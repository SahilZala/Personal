package com.pack.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.model.Response;
import com.pack.model.UserDataModel;
import com.pack.service.UserDataServiceImpl;
import com.pack.util.MyPaths;

@RestController
@CrossOrigin("*")
public class CreateAccountController {
	
	Logger log = Logger.getLogger("CreateAccountController.class");
	@Autowired
	UserDataServiceImpl userDataServiceImpl;
	
	@PostMapping(MyPaths.CREATE_ACCOUNT)
	public ResponseEntity<Response> createAccountController(@Valid @RequestBody UserDataModel userDataModel)
	{
		log.info("Create Account controller");
		try {
			userDataServiceImpl.createUserData(userDataModel);
			return new ResponseEntity<>(new Response("",HttpStatus.OK.value(),"","",null),HttpStatus.OK);
		}
		catch(DuplicateKeyException ex) {
			log.warning(ex.toString());
			return new ResponseEntity<>(new Response("",HttpStatus.BAD_REQUEST.value(),"Username is already present, PLz use different username.",MyPaths.CREATE_ACCOUNT,null),HttpStatus.BAD_REQUEST);
		}
		catch(RuntimeException ex) {
			log.warning(ex.toString());
			return new ResponseEntity<>(new Response("",HttpStatus.BAD_REQUEST.value(),ex.getMessage(),MyPaths.CREATE_ACCOUNT,null),HttpStatus.BAD_REQUEST);
		}
	}
}
