//package com.pack.repository;
//
//import java.util.List;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import com.pack.model.NotesDataModel;
//import com.pack.model.UserDataModel;
//
//public interface NotesDataRepository extends MongoRepository<NotesDataModel,Integer> {
//	
//	@Query("{userDataModel: '?0'}")
//	public List<NotesDataModel> findByUser(UserDataModel user);
//}
