package com.algaworks.algafoot.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafoot.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
//@Qualifier("E_mail")
//@Primary
@Component
public class NotificadorSMS implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS do telefone %s: %s\n", 
		cliente.getNome(), cliente.getTelefone(), mensagem);
		
	}

}
