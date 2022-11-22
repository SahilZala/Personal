package com.pack.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.pack.exception.UserNotFoundException;
import com.pack.model.UserDataModel;
import com.pack.repository.UserDataRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDataRepository userDataRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
		Optional<UserDataModel> userDataModel = userDataRepository.findByUserName(username);
		
		if(userDataModel.isEmpty())
			throw new UserNotFoundException("user not found");
		
		return userDataModel.map(UserDetailsImpl::new).get();
	}

}
