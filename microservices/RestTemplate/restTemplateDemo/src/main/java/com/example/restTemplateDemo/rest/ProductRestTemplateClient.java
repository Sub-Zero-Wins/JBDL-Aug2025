package com.example.restTemplateDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.restTemplateDemo.beans.Product;

@Service
public class ProductRestTemplateClient {

	@Autowired
    private  RestTemplate restTemplate;
	
    private final String BASE_URL = "http://localhost:8080/api/admin/products"; // Adjust port if needed
  

   
    // 1. Create Product (POST)
    public void createProduct() {
        Product newProduct = new Product(4, "Laptop", "Gaming Laptop", 1500.00);
        ResponseEntity<Product> response = restTemplate.postForEntity(BASE_URL + "/add", newProduct, Product.class);

        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Product Created: " + response.getBody());
        } else {
            System.out.println("Failed to create product!");
        }
    }

    // 2. Get Product by ID (GET)
    public void getProductById(int id) {
        ResponseEntity<Product> response = restTemplate.getForEntity(BASE_URL.replace("admin", "customer") + "/get/" + id, Product.class);
        
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Product Retrieved: " + response.getBody());
        } else {
            System.out.println("Product not found!");
        }
    }

    // 3. Update Product (PUT)
    public void updateProduct(int id) {
        Product updatedProduct = new Product(id, "Laptop Pro", "Updated Gaming Laptop", 1800.00);
        
       restTemplate.put(BASE_URL+"/update"+"/"+id, updatedProduct);
        
   
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Product> requestEntity = new HttpEntity<>(updatedProduct, headers);
//
//        ResponseEntity<Product> response = restTemplate.exchange(BASE_URL + "/update/" + id, HttpMethod.PUT, requestEntity, Product.class);
//
//        if (response.getStatusCode() == HttpStatus.OK) {
//            System.out.println("Product Updated: " + response.getBody());
//        } else {
//            System.out.println("Failed to update product!");
//        }
    }

    // 4. Delete Product (DELETE)
    public void deleteProduct(int id) {
        restTemplate.delete(BASE_URL + "/delete/" + id);
        System.out.println("Product Deleted with ID: " + id);
    }
}