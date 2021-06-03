package com.algaworks.algafoot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.algaworks.algafoot.modelo.Cliente;
import com.algaworks.algafoot.notificacao.NivelUrgencia;
import com.algaworks.algafoot.notificacao.Notificador;
import com.algaworks.algafoot.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired(required = false)
	private Notificador notificador;
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT" + notificador);
	}

	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}