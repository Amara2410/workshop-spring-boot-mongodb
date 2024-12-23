package com.amara.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amara.workshopmongo.domain.User;
import com.amara.workshopmongo.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	

}
