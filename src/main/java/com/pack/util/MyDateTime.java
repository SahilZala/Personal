package com.pack.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MyDateTime {

	private static DateTimeFormatter dtf;
	
	public static String getCurrentDate() {
		 dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 LocalDateTime now = LocalDateTime.now();
		 return dtf.format(now); 
	}
	
	public static String getCurrentTime() {
		dtf = DateTimeFormatter.ofPattern("HH:mm");
		return dtf.format(LocalDateTime.now());
	}
}
