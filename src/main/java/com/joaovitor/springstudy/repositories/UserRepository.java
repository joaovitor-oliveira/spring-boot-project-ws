package com.joaovitor.springstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.springstudy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
