package com.pack.service;

import com.pack.model.UserDataModel;

public interface UserDataService {
	UserDataModel findUserDataById(String id);
	UserDataModel findUserData(String userName);
	void createUserData(UserDataModel userDataModel);
}
