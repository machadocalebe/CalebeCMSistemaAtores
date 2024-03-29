package br.edu.infnet.CalebeCM;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.CalebeCM.model.domain.Endereco;

// @Component associa a classe ao framework
// implements ApplicationRunner faz que o método obrigatório run seja executado junto do main
@Component
public class EnderecoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	 Endereco e1 = new Endereco();
	 e1.setCep("123456789");
	 e1.setLogradouro("logradouro");
	 e1.setBairro("bairro");
	 System.out.println("[ENDERECO] " + e1);
	 
	 Endereco e2 = new Endereco("123456789");
	 e2.setCep("123456789");
	 e2.setLogradouro("logradouro");
	 e2.setBairro("bairro");
	 System.out.println("[ENDERECO] " + e2);
	 
	 Endereco e3 = new Endereco("123456789", "logradouro", "complemento", "bairro", "cidade", "uf");
	 System.out.println("[ENDERECO] " + e3);
	}
}