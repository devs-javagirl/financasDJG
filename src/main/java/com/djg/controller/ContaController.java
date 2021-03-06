package com.djg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.model.Conta;
import com.djg.services.ContaService;

@RestController
public class ContaController {
	
	@Autowired
	private ContaService cs;
	
	@PostMapping(path = "/conta", produces = MediaType.APPLICATION_JSON_VALUE)
	public void  criaConta(@RequestBody Conta conta) {
		cs.criaConta(conta);
	}
	
	@GetMapping("/contas")
	public List<Conta> exibeConta() {
		return cs.exibeConta();
	}
	
	@PostMapping(path = "/deletaconta", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletaConta(@RequestBody Conta conta) {
		cs.deletaConta(conta);
	}
	
	@GetMapping(value="/contaporid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Conta listaContaPorId(@PathVariable Long id) {
		return cs.listaContaPorId(id); 
	}
}
