package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pack.model.JWTRequest;
import com.pack.model.JWTResponse;
import com.pack.model.Response;
import com.pack.util.JWTUtil;
import com.pack.util.MyPaths;

@RestController
@CrossOrigin("*")
public class LoginController {
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	UserDetailsService userDetailsService;
	@Autowired
	JWTUtil jwtUtil;
	@PostMapping(MyPaths.LOGIN_PATH)
	public ResponseEntity<Response> token(@RequestBody JWTRequest jwtRequest) {
		try {
		String token = "";	
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						jwtRequest.getUserName(), jwtRequest.getPassword())
				);
			UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUserName());
			token = jwtUtil.generateToken(userDetails);
			return new ResponseEntity<>(new Response("",HttpStatus.OK.value(),"",MyPaths.LOGIN_PATH,new JWTResponse(token)),HttpStatus.OK);
		}
		catch(RuntimeException ex) {
			return new ResponseEntity<>(new Response("",HttpStatus.OK.value(),HttpStatus.FORBIDDEN.name(),MyPaths.LOGIN_PATH,null),HttpStatus.FORBIDDEN);
		}
	}
}
