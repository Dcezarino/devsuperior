package com.devsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
