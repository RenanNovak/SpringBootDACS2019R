package br.univille.dacs2019r.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dacs2019r.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

	Cliente findByNome(String nome);
}
