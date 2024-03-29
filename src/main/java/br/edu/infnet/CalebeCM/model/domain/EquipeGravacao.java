package br.edu.infnet.CalebeCM.model.domain;

import java.util.List;

public class EquipeGravacao {
	private String nome;
	private String email;
	private List<Ator> atores;
	private Endereco endereco;
	
	public EquipeGravacao() {
		
	}
	
	public EquipeGravacao(String nome) {
		this();
		this.setNome(nome);
	}
	
	public EquipeGravacao(String nome, String email) {
		this(nome);
		this.setEmail(email);
	}
	
	// Esse contrutor é capaz de receber o atributo endereço
	public EquipeGravacao(String nome, String email, Endereco endereco) {
		this(nome, email);
		this.setEndereco(endereco);
	}
	
	@Override
	public String toString() {
		return "Equipe: " + nome + " - " + email + " - " + endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Ator> getAtores() {
		return atores;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
}

