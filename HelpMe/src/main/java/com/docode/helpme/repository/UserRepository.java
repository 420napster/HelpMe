package com.docode.helpme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docode.helpme.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
