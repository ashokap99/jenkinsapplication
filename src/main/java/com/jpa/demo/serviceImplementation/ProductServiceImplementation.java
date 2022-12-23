package com.jpa.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.model.Products;
import com.jpa.demo.repository.ProductsRepository;
import com.jpa.demo.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{
	@Autowired
	ProductsRepository productRepository;

	@Override
	public Products saveProducts(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findall();
	}

	@Override
	public List<Products> findByProductType(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByType(name);
	}

	@Override
	public Integer update(String name, int id) {
		// TODO Auto-generated method stub
		return productRepository.updateProductType(name, id);
	}

//	@Override
//	public List<Products> getProduct(String name) {
//		// TODO Auto-generated method stub
//		return productRepository.findProduct(name);
//	}

}
