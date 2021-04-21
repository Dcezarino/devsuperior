package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
