package com.algaworks.algafoot.domain.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafoot.AlgafootApiApplication;
import com.algaworks.algafoot.domain.model.Cozinha;
import com.algaworks.algafoot.domain.repository.CozinhaRepository;

public class IncluirCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafootApiApplication.class)
		.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository cozinhaRipository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Chenesa");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Francesa");
		
		cozinha1 = cozinhaRipository.salvar(cozinha1);
		cozinha2 = cozinhaRipository.salvar(cozinha2);
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
	}	
}
