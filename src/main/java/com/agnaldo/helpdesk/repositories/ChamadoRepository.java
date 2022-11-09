package com.agnaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldo.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

	
}
