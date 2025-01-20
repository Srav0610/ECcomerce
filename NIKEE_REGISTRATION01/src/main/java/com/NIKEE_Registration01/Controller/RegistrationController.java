package com.NIKEE_Registration01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NIKEE_Registration01.Entity.Registration;
import com.NIKEE_Registration01.Service.RegistrationService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
@Autowired
	private RegistrationService rs;
	
	@PostMapping("/postuser")
	public ResponseEntity<Registration> adduser(@RequestBody Registration r) {
	
		return ResponseEntity.ok(rs.adduser(r));
		
	}
	
	@GetMapping("/get/{userName}")
	public ResponseEntity<Registration> getuser(@PathVariable("userName") String userName) {
	
		return ResponseEntity.ok(rs.findById(userName));
		
	}
	
	
}
