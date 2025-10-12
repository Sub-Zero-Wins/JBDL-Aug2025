package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {

	List<Contacts> findByUserId(int userId);

}
