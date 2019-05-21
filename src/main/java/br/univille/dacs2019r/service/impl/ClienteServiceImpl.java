package br.univille.dacs2019r.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dacs2019r.model.Cliente;
import br.univille.dacs2019r.repository.ClienteRepository;
import br.univille.dacs2019r.service.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
