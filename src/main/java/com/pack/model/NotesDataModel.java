//package com.pack.model;
//
//import java.sql.Date;
//import java.sql.Time;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class NotesDataModel {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
//	@ManyToOne
//	private UserDataModel user;
//	private String title;
//	private String note;
//	private String date;
//	private String time;
//	private boolean activation;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public UserDataModel getUser() {
//		return user;
//	}
//	public void setUser(UserDataModel user) {
//		this.user = user;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getNote() {
//		return note;
//	}
//	public void setNote(String note) {
//		this.note = note;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
//	public boolean isActivation() {
//		return activation;
//	}
//	public void setActivation(boolean activation) {
//		this.activation = activation;
//	}
//	public NotesDataModel(int id, UserDataModel user, String title, String note, String date, String time,
//			boolean activation) {
//		super();
//		this.id = id;
//		this.user = user;
//		this.title = title;
//		this.note = note;
//		this.date = date;
//		this.time = time;
//		this.activation = activation;
//	}
//	public NotesDataModel() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "NotesDataModel [id=" + id + ", user=" + user + ", title=" + title + ", note=" + note + ", date=" + date
//				+ ", time=" + time + ", activation=" + activation + "]";
//	}
//	
//	
//}
