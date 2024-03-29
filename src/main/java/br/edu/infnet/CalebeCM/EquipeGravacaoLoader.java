package br.edu.infnet.CalebeCM;

import br.edu.infnet.CalebeCM.clients.IEnderecoClient;
import br.edu.infnet.CalebeCM.model.domain.Endereco;
import br.edu.infnet.CalebeCM.model.domain.EquipeGravacao;
import br.edu.infnet.CalebeCM.model.service.EquipeGravacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// @Component associa a classe ao framework
// implements ApplicationRunner faz que o método obrigatório run seja executado junto do main
@Component
public class EquipeGravacaoLoader implements ApplicationRunner {
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Instanciar obj EquipeService para usar seus métodos
		// Testar alguns métodos CRUD do EquipeService
		
		 Endereco equipeEndereco = enderecoClient.obterPorCep("20010020");
		 
		 
		// equipeEndereco.setCep("123456789");
		// equipeEndereco.setLogradouro("logradouro");
		// equipeEndereco.setBairro("bairro");
		
		EquipeGravacaoService equipeGravacaoService = new EquipeGravacaoService();
		
		equipeGravacaoService.incluir(new EquipeGravacao("WornerStudio" , "WornerStudio@mail", equipeEndereco));
		
		equipeGravacaoService.excluir("WornerStudio");
		
		equipeGravacaoService.incluir(new EquipeGravacao("DreamStudio", "DreamStudio@mail", equipeEndereco));
		
		System.out.println(" - " + equipeGravacaoService.obter("DreamStudio"));
		
		equipeGravacaoService.incluir(new EquipeGravacao("SonyStudio", "SonyStudio@mail", equipeEndereco));
		
		System.out.println(" - " + equipeGravacaoService.obterLista());
	}
}
