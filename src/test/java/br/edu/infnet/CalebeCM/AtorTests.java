package br.edu.infnet.CalebeCM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.CalebeCM.model.domain.Ator;

@SpringBootTest
class AtorTests {

	
	@Test
	void AtorFamoso() {
		Ator t1 = new Ator();
		t1.setNome("Brad Pitch");
		t1.setRegistro(1);
		t1.setSalario(400000);
		t1.setFamoso(true);
		System.out.println();
		
		assertEquals("Brad Pitch", t1.getNome());
		assertEquals(1, t1.getRegistro());
		assertEquals(400000, t1.getSalario());
		assertEquals(true, t1.isFamoso());
		assertEquals("Sim", t1.VerificarFamoso());
		assertEquals(600000, t1.CalcularSalarioFamoso());
	}

	@Test
	void AtorNãoFamoso() {
		Ator t1 = new Ator();
		t1.setNome("Will Smith");
		t1.setRegistro(2);
		t1.setSalario(400000);
		t1.setFamoso(false);
		System.out.println();
		
		assertEquals("Will Smith", t1.getNome());
		assertEquals(2, t1.getRegistro());
		assertEquals(400000, t1.getSalario());
		assertEquals(false, t1.isFamoso());
		assertEquals("Não", t1.VerificarFamoso());
		assertEquals(400000, t1.CalcularSalarioFamoso());
	}	

}
