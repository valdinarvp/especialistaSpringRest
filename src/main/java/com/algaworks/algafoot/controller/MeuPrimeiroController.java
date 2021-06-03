package com.algaworks.algafoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafoot.modelo.Cliente;
import com.algaworks.algafoot.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
	    Cliente joao = new Cliente("Vinicius Pereira", "vini@gmail.com", "(61) 33314827");
	    
	    ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
	
}