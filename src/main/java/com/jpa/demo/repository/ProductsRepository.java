package com.jpa.demo.repository;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.jpa.demo.model.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
	
	@Query(value = "SELECT * FROM product_details", nativeQuery = true) 
	 List<Products> findall();
	
	@Query(value ="SELECT * FROM product_details WHERE product_type = ?1", nativeQuery = true) 
	List<Products> findByType(String name);

	@Transactional
	@Modifying
	@Query(value = "update product_details set product_type = ?1 where product_id = ?2", nativeQuery = true)
	Integer updateProductType(String name, int id);
	
//	@Query("SELECT u FROM product_details u WHERE u.product_type like '%ry'")
//	List<Products> findProduct(String name);  

}
