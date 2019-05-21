package br.univille.dacs2019r.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.dacs2019r.model.Cliente;

@Service
public interface ClienteService {
	
	List<Cliente> getAll();
}
