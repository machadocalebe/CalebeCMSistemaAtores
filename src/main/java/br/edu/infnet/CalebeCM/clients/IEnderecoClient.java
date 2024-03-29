package br.edu.infnet.CalebeCM.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.CalebeCM.model.domain.Endereco;

// https://viacep.com.br/ws
@FeignClient(url = "https://viacep.com.br/ws", name = "EnderecoClient")
public interface IEnderecoClient {
	
	@GetMapping(value = "/{cep}/json/")
	Endereco obterPorCep(@PathVariable String cep);
}
