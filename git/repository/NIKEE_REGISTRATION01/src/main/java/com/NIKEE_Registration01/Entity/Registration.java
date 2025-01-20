package com.NIKEE_Registration01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {

	@Id    
	private String UserName;
	private String Password;
	private String fristName;
	private String lastName;
	private String gender;
	private Integer age;
	private String role;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Registration(String userName, String password, String fristName, String lastName, String gender, Integer age,
			String role) {
		super();
		UserName = userName;
		Password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.role = role;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
