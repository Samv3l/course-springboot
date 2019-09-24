package com.roomfive.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roomfive.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
