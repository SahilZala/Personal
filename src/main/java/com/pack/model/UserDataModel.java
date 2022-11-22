package com.pack.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_data_model")
public class UserDataModel {
	
	private String id;
	
	@NotEmpty
	@Size(min=5,message="the user name length should not be less then 5")
	@Indexed(unique=true)
	private String userName;
	@Size(min=1,message="my name should not be empty")
	private String myName;
	private String userAddress;
	@Size(min=10,max=10,message="enter genuen mobile number")
	private String mobileNumber;
	@Size(min=1,message="emailid should not be empty")
	private String emailId;
	@NotEmpty
	@Size(min=8,message="password length should minimum 8")
	private String password;
	@NotEmpty
	private String roles;
	
	public UserDataModel() {
		super();
	}
	
	
	public UserDataModel(String id, @NotEmpty String userName, String myName, String userAddress, String mobileNumber,
			String emailId, @NotEmpty String password, @NotEmpty String roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.myName = myName;
		this.userAddress = userAddress;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.password = password;
		this.roles = roles;
	}

	

	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserDataModel [id=" + id + ", userName=" + userName + ", myName=" + myName + ", userAddress="
				+ userAddress + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", password=" + password
				+ ", roles=" + roles + "]";
	}	
	
	
}
