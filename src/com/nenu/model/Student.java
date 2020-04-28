package com.nenu.model;

public class Student {
	private int ID;
	private String name;
	private String birDate;
	private String gender;
	
	
	public Student() {
		
	}
	

	public Student(int iD, String name, String birDate, String gender) {
		super();
		ID = iD;
		this.name = name;
		this.birDate = birDate;
		this.gender = gender;
	}


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirDate() {
		return birDate;
	}
	public void setBirDate(String birDate) {
		this.birDate = birDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String introduction() {
		String str =this.getID()+"\t"+this.getName()+"\t"+this.getBirDate()+"\t"+this.getGender();
		return str;
	}
}
