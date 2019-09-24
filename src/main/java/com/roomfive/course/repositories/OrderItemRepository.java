package com.roomfive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roomfive.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
