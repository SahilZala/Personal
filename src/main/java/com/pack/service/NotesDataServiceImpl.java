//package com.pack.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.pack.exception.NotesNotFoundException;
//import com.pack.model.NotesDataModel;
//import com.pack.model.UserDataModel;
//import com.pack.repository.NotesDataRepository;
//
//@Service
//public class NotesDataServiceImpl implements NotesDataService {
//
//	@Autowired
//	NotesDataRepository notesDataRepository;
//	
//	@Override
//	public void createNotes(NotesDataModel notesDataModel) {
//		notesDataRepository.save(notesDataModel);
//	}
//
//	@Override
//	public List<NotesDataModel> getAllNotes(UserDataModel user) throws NotesNotFoundException{
//		List<NotesDataModel> notesDataModelList = notesDataRepository.findByUser(user);
//		if(notesDataModelList.isEmpty())
//		{
//			throw new NotesNotFoundException("notes not found");
//		}
//		return notesDataModelList;
//	}
//	
//}
