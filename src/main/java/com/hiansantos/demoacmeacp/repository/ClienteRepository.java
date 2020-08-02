package com.hiansantos.demoacmeacp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiansantos.demoacmeacp.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}