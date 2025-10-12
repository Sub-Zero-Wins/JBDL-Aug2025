package com.example.productApi.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.productApi.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	
	Product findByName(String name);//JPA Query Methods
	

	
	
}
