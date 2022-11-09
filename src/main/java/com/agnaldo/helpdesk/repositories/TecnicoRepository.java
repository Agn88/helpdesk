package com.agnaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldo.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

	
}
