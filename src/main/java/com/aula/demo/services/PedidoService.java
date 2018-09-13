package com.aula.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.demo.domain.Pedido;
import com.aula.demo.repositories.PedidoRepository;
import com.aula.demo.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " +id+", Tipo: "+ Pedido.class.getName()));

	}

}
