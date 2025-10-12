package com.example.productApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productApi.entities.Product;
import com.example.productApi.service.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductsService 
{
	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		
		return repo.save(product);
	}

	@Override
	public Product getProductById(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product prod=null;
		
		if(repo.findById(id)!=null)
		{
			prod=repo.save(product);
		}
		
		return product;
	}

	@Override
	public boolean deleteProduct(int id) {
		 
		Boolean res=false;
		if(repo.findById(id)!=null)
		{
			repo.deleteById(id);
			res=true;
		}
		return res;
	}

	@Override
	public Product searchProduct(String name) {
	
		return repo.findByName(name);
	}

	

}
