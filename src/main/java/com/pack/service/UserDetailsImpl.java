package com.pack.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.pack.model.UserDataModel;

@Service
public class UserDetailsImpl implements UserDetails{
	private static final long serialVersionUID = 1L;
	UserDataModel userDataModel;
	List<GrantedAuthority> authority;
	public UserDetailsImpl() {
	}
	public UserDetailsImpl(UserDataModel userDataModel) {
		super();
		this.userDataModel = userDataModel;
		authority =
				Arrays.stream(
						userDataModel.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authority;
	}

	@Override
	public String getPassword() {
		return userDataModel.getPassword();
	}

	@Override
	public String getUsername() {
		return userDataModel.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}



}
