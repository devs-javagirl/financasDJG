package com.djg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djg.model.Transacao;
import com.djg.repository.TransacaoRepository;
import com.djg.services.TransacaoService;

@RestController
public class TransacaoController {
	
	@Autowired
	private TransacaoService ts;
	
	@PostMapping(path="/transacao", produces = MediaType.APPLICATION_JSON_VALUE)
	public void criaTransacao(@RequestBody Transacao transacao) {
		ts.criaTransacao(transacao);
	}
	
	@RequestMapping("/transacoes")
	public List<Transacao> exibeTransacao() {
		return ts.exibeTransacao();
	}
	
	@PostMapping(path = "/deletatransacao", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletaTransacao(@RequestBody Transacao transacao) {
		ts.deletaTransacao(transacao);
	}
	
	@GetMapping(value="/transacao/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Transacao listaTransacaoPorId(@PathVariable Long id) {
		return ts.listaTransacaoPorId(id);
	}
	
}
