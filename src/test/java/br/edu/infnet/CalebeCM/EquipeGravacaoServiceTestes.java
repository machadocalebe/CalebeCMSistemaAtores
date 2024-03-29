package br.edu.infnet.CalebeCM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.CalebeCM.model.domain.EquipeGravacao;
import br.edu.infnet.CalebeCM.model.service.EquipeGravacaoService;

@SpringBootTest
public class EquipeGravacaoServiceTestes {
	
	private EquipeGravacaoService equipeservice;
	
	@BeforeEach
	void setUp() {
		equipeservice = new EquipeGravacaoService();
	}
	
	@Test
	void inclusao() {
		EquipeGravacao equipeGravacao = new EquipeGravacao("Liquid" , "LiquidTeam@mail");
		equipeservice.incluir(equipeGravacao);
		
		assertEquals(equipeGravacao, equipeservice.obter("Liquid"));
	}
	
	@Test
	void esclusao() {
		equipeservice.excluir(null);
	}
	
	@Test
	void recuperacaoTotal() {
		equipeservice.obter(null);
	}
	
	@Test
	void inclusaoMockito() {
	//
	}


}
