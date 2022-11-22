//package com.pack.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.pack.model.NotesDataModel;
//import com.pack.model.Response;
//import com.pack.service.NotesDataService;
//import com.pack.util.MyDateTime;
//import com.pack.util.MyPaths;
//
//@RestController
//@RequestMapping(MyPaths.USER_PATH)
//public class CreateNotesController {
//	
//	@Autowired
//	NotesDataService notesDataService;
//	
//	@PostMapping(MyPaths.CREATE_NOTES)
//	public ResponseEntity<Response> createNotesController(@RequestBody NotesDataModel notesDataModel){
//
//		System.out.println(notesDataModel);
//		notesDataModel.setDate(MyDateTime.getCurrentDate());
//		notesDataModel.setTime(MyDateTime.getCurrentTime());
//		try {
//			notesDataService.createNotes(notesDataModel);
//			return new ResponseEntity<>(
//					new Response("",HttpStatus.OK.value(),"",
//							MyPaths.USER_PATH+MyPaths.CREATE_NOTES,null),HttpStatus.OK);
//		}
//		catch(RuntimeException ex) {
//			return new ResponseEntity<>(
//					new Response(
//							"",
//							HttpStatus.FORBIDDEN.value(),
//							ex.getMessage(),
//							MyPaths.USER_PATH+MyPaths.CREATE_NOTES,
//							null)
//					,HttpStatus.FORBIDDEN);
//		}
//		
//		
//	}
//}
