package com.joaovitor.springstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.springstudy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
