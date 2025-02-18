package com.springfirstproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfirstproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}