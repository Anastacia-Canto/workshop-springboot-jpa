package com.anastacia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anastacia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
