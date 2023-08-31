package com.anastacia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anastacia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
