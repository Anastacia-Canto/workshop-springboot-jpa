package com.anastacia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anastacia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
