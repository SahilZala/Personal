package com.pack.exception;

public class NotesNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotesNotFoundException(String msg){
		 super(msg);
	 }
}
