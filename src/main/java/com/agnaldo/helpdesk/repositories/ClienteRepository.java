package com.agnaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldo.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}
