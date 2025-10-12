package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ContactsRepository;
import com.example.entity.Contacts;

//import io.micrometer.tracing.annotation.NewSpan;

@Service
public class ContactsService
{

	@Autowired
	ContactsRepository repo;

 //  @NewSpan("getContactsByUserId")
	public List<Contacts> getContactsByUserId(int userId)
	{
		return repo.findByUserId(userId);
	}

	public List<Contacts> getAllContacts() {
		
		return repo.findAll();
	}
}
