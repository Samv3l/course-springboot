package com.roomfive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roomfive.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
