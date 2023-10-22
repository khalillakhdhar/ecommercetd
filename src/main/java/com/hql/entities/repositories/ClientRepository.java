package com.hql.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
