package com.algaworks.algafoot.domain.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafoot.AlgafootApiApplication;
import com.algaworks.algafoot.domain.model.Cozinha;
import com.algaworks.algafoot.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafootApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRipository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> cozinhas = cozinhaRipository.listar();
		
		for (Cozinha cozinha : cozinhas) {
			System.out.println("----------------------------");
			System.out.println("Nome da cozinha: " + cozinha.getNome());
			System.out.println("----------------------------");
		}
	}	
}
