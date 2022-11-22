package com.pack.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pack.model.UserDataModel;

public interface UserDataRepository extends MongoRepository<UserDataModel, String>
{
	@Query("{userName: '?0'}")
	Optional<UserDataModel> findByUserName(String userName);
}