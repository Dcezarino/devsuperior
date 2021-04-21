package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
