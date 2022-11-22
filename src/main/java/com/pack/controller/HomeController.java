package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pack.model.Response;
import com.pack.util.MyPaths;

@RestController
@RequestMapping(MyPaths.USER_PATH)
public class HomeController {
	@GetMapping(MyPaths.HOME_PATH)
	public ResponseEntity<Response> homeController(){
		return new ResponseEntity<>(new Response("",HttpStatus.OK.value(),"",MyPaths.LOGIN_PATH,"home"),HttpStatus.OK);
	}
}
