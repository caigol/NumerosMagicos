package br.com.caique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.caique.service.NumerosMagicosService;

@RestController
public class NumerosMagicosController {

	@Autowired
	private NumerosMagicosService service;
	
	@GetMapping("/magicNumbers/{numberOne}/{numberTwo}")
	public int numerosMagicos(@PathVariable("numberOne") int numberOne, @PathVariable("numberTwo") int numberTwo) throws Exception {
		return service.showMagicNumbers(numberOne, numberTwo);
	}


}
