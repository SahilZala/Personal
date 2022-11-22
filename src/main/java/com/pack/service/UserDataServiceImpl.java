package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.exception.UserNotFoundException;
import com.pack.model.UserDataModel;
import com.pack.repository.UserDataRepository;

@Service
public class UserDataServiceImpl implements UserDataService {
	
	
	@Autowired
	UserDataRepository userModelRepository;
	public UserDataModel findUserDataById(String id) throws UserNotFoundException{
		if(!userModelRepository.findById(id).isPresent())
			throw new UserNotFoundException("user not found");
		return userModelRepository.findById(id).get();
	}
	@Override
	public UserDataModel findUserData(String userName) throws UserNotFoundException{
		if(!userModelRepository.findByUserName(userName).isPresent())
			throw new UserNotFoundException("user not found");
		return userModelRepository.findByUserName(userName).get();
	}
	@Override
	public void createUserData(UserDataModel userDataModel) throws RuntimeException{
		userModelRepository.save(userDataModel);
	}
	
	
}
