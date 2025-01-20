package com.NIKEE_Registration01.Service;

import java.util.List;

import com.NIKEE_Registration01.Entity.Registration;

public interface RegistrationService {

	 
	public Registration adduser(Registration register);
	public Registration findById(String UserName); 
	List<Registration> findAll();    
}
