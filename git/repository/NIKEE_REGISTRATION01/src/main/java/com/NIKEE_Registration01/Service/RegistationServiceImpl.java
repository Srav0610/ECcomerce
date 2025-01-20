package com.NIKEE_Registration01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NIKEE_Registration01.Entity.Registration;
import com.NIKEE_Registration01.Repository.RegistrationRepository;
@Service("registrationService")
public class RegistationServiceImpl implements RegistrationService{
	@Autowired
	private RegistrationRepository rr;

	@Override
	public Registration adduser(Registration register) {
		
		// TODO Auto-generated method stub
		//Registration r=rr.findById(register.getUserName()).orElseThrow();
		
		
		return rr.saveAndFlush(register);
	}

	@Override
	public Registration findById(String UserName) {
		// TODO Auto-generated method stub
		Registration r= rr.findById(UserName).orElseThrow();
	      	return r;
	}

	@Override
	public List<Registration> findAll() {
		// TODO Auto-generated method stub
		   return rr.findAll();
	}

}
