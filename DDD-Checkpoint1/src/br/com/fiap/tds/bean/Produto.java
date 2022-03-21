package br.com.fiap.tds.bean;

public class Produto {
	
	private String nome;
		
	private int codigo;
	
	private double preco;
	
	private int qtd;
	
	@Override
	public String toString() {
		return "Nome: " + nome+ "Código: " + codigo + "Preço: " + preco + " Quantidade: " + qtd;
	}
	
	public String valor_chave() {
		return nome + preco + qtd;
	}
	
	public Produto() {}

	public Produto(String nome, int codigo, double preco, int qtd) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.qtd = qtd;
	}

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public Produto(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public Produto(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	
}
