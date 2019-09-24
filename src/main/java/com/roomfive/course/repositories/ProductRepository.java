package com.roomfive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roomfive.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
