package com.joaovitor.springstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.springstudy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
