	package com.example.productApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.productApi.entities.Product;
import com.example.productApi.service.ProductsService;


@RestController
@RequestMapping("/api/customer/products")
public class ProductCustomerController 
{
	@Autowired
	ProductsService service;

	@GetMapping("/get/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/getAll")
	public List<Product> getAllProducts() {
		return service.getAllProducts();		
	}

	@GetMapping("/search")
	public Product searchProduct(@RequestParam String name) {

		return service.searchProduct(name);
	}

}
