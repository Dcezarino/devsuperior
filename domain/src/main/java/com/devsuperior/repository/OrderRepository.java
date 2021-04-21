package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
