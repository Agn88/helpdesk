package com.agnaldo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnaldo.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	
}
