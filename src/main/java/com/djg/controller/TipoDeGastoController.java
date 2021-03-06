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

import com.djg.model.TipoDeGasto;
import com.djg.repository.TipoDeGastoRepository;
import com.djg.services.TipoDeGastoService;

@RestController
public class TipoDeGastoController {
	
	@Autowired
	private TipoDeGastoService tdgs;
		
	@PostMapping(path="/tipodegasto", produces = MediaType.APPLICATION_JSON_VALUE)
	public void criaTipoDeGasto(@RequestBody TipoDeGasto tipoDeGasto) {
		tdgs.criaTipoDeGasto(tipoDeGasto);
	}
	
	@RequestMapping("/tiposdegasto")
	public List<TipoDeGasto> listarTiposDeGastos(){
		return tdgs.listarTiposDeGastos();
	}
	
	@PostMapping(path = "/deletatipodegasto", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletaTipoDeGasto(@RequestBody TipoDeGasto tipoDeGasto) {
		tdgs.deletaTipoDeGasto(tipoDeGasto);
	}
	
	@GetMapping(value="/listaTipoDeGastoPorId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TipoDeGasto listaTipoDeGastoPorId(@PathVariable Integer id) {
		return tdgs.listaTipoDeGastoPorId(id);
	}
	
}
