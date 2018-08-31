package com.aula.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aula.demo.domain.Cliente;
import com.aula.demo.services.ClienteService;

@RestController
@RequestMapping(value="/categorias")
public class ClienteResources {
	
	@Autowired
	private ClienteService service;
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
				
		
		
		
		List<Cliente> lista= new ArrayList<>();
	
		return ResponseEntity.ok().body(obj);
	}

}
