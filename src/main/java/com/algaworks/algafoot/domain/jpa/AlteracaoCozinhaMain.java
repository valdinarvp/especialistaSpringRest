package com.algaworks.algafoot.domain.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafoot.AlgafootApiApplication;
import com.algaworks.algafoot.domain.model.Cozinha;
import com.algaworks.algafoot.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafootApiApplication.class)
		.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository cozinhaRipository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(4L);
		cozinha.setNome("Coreana");
		
		cozinhaRipository.salvar(cozinha);
		
		
	}	
}
