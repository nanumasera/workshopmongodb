package com.nanuworkshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nanuworkshopmongo.domain.User;
import com.nanuworkshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
		
	}
}
