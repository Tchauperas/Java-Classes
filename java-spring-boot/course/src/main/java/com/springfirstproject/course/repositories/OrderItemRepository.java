package com.springfirstproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfirstproject.course.entities.OrderItem;
import com.springfirstproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}