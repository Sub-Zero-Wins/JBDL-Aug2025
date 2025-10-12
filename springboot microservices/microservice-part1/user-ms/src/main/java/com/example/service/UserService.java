package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.UserRepository;
import com.example.entity.Contacts;
import com.example.entity.User;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	@Autowired
	RestTemplate restTemplate;

	
	
		@CircuitBreaker(name="userService",fallbackMethod="getUserByIdFallback")
		public User getUserById(int userId)
		{
			User user=repo.findById(userId).get();
			List<Contacts> contacts=restTemplate.getForObject("http://contacts-ms/api/contacts/"+userId, List.class);
			user.setContact(contacts);
			return user;
		}
		
		public User getUserByIdFallback(int userId,Throwable t)
		{
			System.out.println(" our services are currently unavailible please try later : ( ");
			  return new User();
		}
	 
	 
	
	public List<User> getAllUsers() {

		return repo.findAll();
	}
	


}
