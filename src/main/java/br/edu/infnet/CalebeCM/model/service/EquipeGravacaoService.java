package br.edu.infnet.CalebeCM.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.CalebeCM.model.domain.EquipeGravacao;

public class EquipeGravacaoService {
	
	// Pseudo banco de dados em forma de MAP para guardar as equipes
	private static Map<String, EquipeGravacao> equipes = new HashMap<String, EquipeGravacao>();
	
	
	// CRUD
	public void incluir(EquipeGravacao equipeGravacao) {
		equipes.put(equipeGravacao.getNome(), equipeGravacao);
	}
	
	public void excluir(String nome) {
		equipes.remove(nome);
	}
	
	public Collection<EquipeGravacao> obterLista() {
		return equipes.values();
	}
	
	public EquipeGravacao obter(String nome){
		return equipes.get(nome);
	}
}
