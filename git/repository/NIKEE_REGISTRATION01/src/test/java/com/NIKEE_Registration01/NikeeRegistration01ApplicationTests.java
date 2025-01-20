package com.NIKEE_Registration01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.NIKEE_Registration01.Entity.Registration;
import com.NIKEE_Registration01.Repository.RegistrationRepository;



@SpringBootTest
class NikeeRegistration01ApplicationTests {

		@Autowired
		private RegistrationRepository registrationService;
		

		@Test
		@DisplayName("Test case for adding a customer....")
		void addCustomer() {
			Registration r= new Registration();
			r.setFristName("Sravanthi");
			r.setLastName("Manchikatla");
			r.setGender("Female");
			r.setUserName("Srav123");
			r.setPassword("Srav@1234");
			r.setRole("Employee");
			r.setAge(23);
			Registration rs=	registrationService.save(r);
			System.out.println(rs);
			Optional<Registration>  register = registrationService.findById(r.getUserName()); 
			assertTrue(register.isPresent()); 
			assertEquals(r.getFristName(), register.get().getFristName()); 
			assertEquals(r.getLastName(), register.get().getLastName()); 
			assertEquals(r.getUserName(), register.get().getUserName()); 
			assertEquals(r.getPassword(), register.get().getPassword()); 
			assertEquals(r.getAge(), register.get().getAge());
			assertEquals(r.getGender(), register.get().getGender());
			assertEquals(r.getRole(), register.get().getRole());
			
			
		}

	}


