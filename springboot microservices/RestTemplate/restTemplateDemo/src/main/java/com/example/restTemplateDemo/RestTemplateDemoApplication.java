package com.example.restTemplateDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.restTemplateDemo.rest.ProductRestTemplateClient;

@SpringBootApplication
public class RestTemplateDemoApplication implements CommandLineRunner{

	

	@Autowired
	private ProductRestTemplateClient client;



	public static void main(String[] args) {
		SpringApplication.run(RestTemplateDemoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
	//  client.createProduct();

		// Get Product by ID
//		client.getProductById(4);
//		
//		// Update Product
///		   client.updateProduct(4);
//		   
//		   client.getProductById(101);

		// Delete Product
		 client.deleteProduct(101);

	}

}
