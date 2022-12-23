package com.jpa.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.demo.model.Products;

@Service
public interface ProductService {
	Products saveProducts(Products products);
	List<Products> getAll();
	List<Products> findByProductType(String name);
	Integer update(String name, int id);
	//List<Products> getProduct(String name);

}
