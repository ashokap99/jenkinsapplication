package com.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.model.Products;
import com.jpa.demo.repository.ProductsRepository;
import com.jpa.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
   
	@Autowired
	private ProductService productSerivice;
	@Autowired
	private ProductsRepository productRepository;
	
	@PostMapping(value = "/save")
	public Products saveProducts(@RequestBody Products products) {
		return productSerivice.saveProducts(products); 
	}
	@GetMapping(value = "/getAll")
	public List<Products> getAll(){
		return productRepository.findall();
	}
	@GetMapping(value = "/getByType/{name}")
	public List<Products> findByProductType(@PathVariable String name){
		return productRepository.findByType(name);
	}
	@PutMapping(value = "/updateType/{name}/{id}")
	Integer update(@PathVariable String name, @PathVariable int id) {
		return productRepository.updateProductType(name, id);	
	}
//	@GetMapping(value = "/findType")
//	List<Products> getProduct(String name){
//		return productRepository.findProduct(name);
//	}
}
