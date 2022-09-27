package com.joaovitor.springstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.springstudy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
