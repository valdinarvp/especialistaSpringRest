package com.algaworks.algafoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafoot.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	public AtivacaoClienteService ativacaoClienteService(){
		return new AtivacaoClienteService();
	}

}
