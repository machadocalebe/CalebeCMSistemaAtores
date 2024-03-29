package br.edu.infnet.CalebeCM.model.domain;

// A classe treinador representa a entidade responsável por treinar um time de atletas.
public class Ator {

	private int registro;
	private String nome;
	private float salario;
	private boolean Famoso;
	private Endereco endereco;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isFamoso() {
		return Famoso;
	}
	public void setFamoso(boolean famoso) {
		this.Famoso = famoso;
	}
	
	// Método que aumenta o salário em 50% caso o treinador seja um renomado ex-campeão.
	public float CalcularSalarioFamoso() {
		if(Famoso) {
			return (float) (this.salario*1.5);
		} else {
			return this.salario;
		}
	}
	
	
	// Método que retorna uma string que diz se o objeto é ou não campeão
	public String VerificarFamoso() {
		return Famoso ? "Sim" : "Não";
	}
}
