package com.anastacia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anastacia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
