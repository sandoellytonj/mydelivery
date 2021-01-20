package com.spring.mydelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mydelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
	
}
