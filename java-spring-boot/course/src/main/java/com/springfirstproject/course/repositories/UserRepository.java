package com.springfirstproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfirstproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
} 