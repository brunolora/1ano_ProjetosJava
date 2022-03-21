package br.com.fiap.tds.exercicio03.bean;

public class Titular {

	//Atributos
	private String nome;
	
	private String cpf;

	//Construtores
	public Titular() {}
	
	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//M�todos
	@Override
	public String toString() {
		return "Nome: " + nome + " CPF:" + cpf;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
