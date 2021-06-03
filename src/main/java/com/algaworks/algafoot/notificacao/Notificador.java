package com.algaworks.algafoot.notificacao;

import com.algaworks.algafoot.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}