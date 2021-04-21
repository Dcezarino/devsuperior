package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
