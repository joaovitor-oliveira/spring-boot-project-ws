package com.joaovitor.springstudy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.springstudy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
