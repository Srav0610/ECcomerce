package com.NIKEE_Registration01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NIKEE_Registration01.Entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, String>{

}
