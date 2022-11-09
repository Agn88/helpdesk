package com.agnaldo.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agnaldo.helpdesk.domain.Chamado;
import com.agnaldo.helpdesk.domain.Cliente;
import com.agnaldo.helpdesk.domain.Tecnico;
import com.agnaldo.helpdesk.domain.enums.Perfil;
import com.agnaldo.helpdesk.domain.enums.Prioridade;
import com.agnaldo.helpdesk.domain.enums.Status;
import com.agnaldo.helpdesk.repositories.ChamadoRepository;
import com.agnaldo.helpdesk.repositories.ClienteRepository;
import com.agnaldo.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "33415678792", "valdir@gmail.com", "1234");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "46815426874", "linus@gmail.com", "1234");
	 
		
		Chamado cham1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, 
				"Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cham1));
	}
	
}
